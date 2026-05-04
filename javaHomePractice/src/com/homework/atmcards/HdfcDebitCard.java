package com.homework.atmcards;

import java.util.ArrayList;
import java.util.Collections;

import com.homework.atmexceptions.InsufficientFundsException;
import com.homework.atmexceptions.InsufficientMachineBalanceException;
import com.homework.atmexceptions.InvalidAmountException;
import com.homework.atmexceptions.NotAOperatorException;
import com.homework.interfaces.IATMService;

public class HdfcDebitCard implements IATMService{
	String name;
	long debitCardNumber;
	int pinNumber;
	ArrayList<String>statement;
	final String type="user";
	int chances;
	double accountBalance;
	
	

	public HdfcDebitCard(String name, long debitCardNumber, int pinNumber, double accountBalance) {
		chances=3;
		this.name = name;
		this.debitCardNumber = debitCardNumber;
		this.pinNumber = pinNumber;
		this.accountBalance = accountBalance;
		statement=new ArrayList<>();
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientFundsException, InsufficientMachineBalanceException {
		if(wthAmount<=0) {
			throw new InvalidAmountException("you can enter zero amount "+"to withdraw please eneter a valid amount");
		}else {
			if(wthAmount%100!=0) {
				throw new InvalidAmountException("please withdraw multiples of 100 like 500,1000,700");
			}else {
				if(wthAmount>accountBalance) {
					throw new InsufficientFundsException("you cant withdraw amount of your acount");
				}else {
					accountBalance-=wthAmount;
					statement.add("Debited"+wthAmount);
					return wthAmount;
				}
			}
		}
		
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		if(dptAmount<=0 || dptAmount%100!=0) {
			throw new InvalidAmountException("you cant enter amount less than zero rupees and deposits should be multiples of 100 ");
		
		}else {
			accountBalance+=dptAmount;
			statement.add("credited"+dptAmount);
			
		}
	}

	@Override
	public double checkAccountBalance() {
		
		return accountBalance;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber=pinNumber;		
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void decreaseChances() {
		--chances;		
	}

	@Override
	public int getChances() {
				return chances;
	}

	@Override
	public void resetPinChances() {
		chances=3;
	}

	@Override
	public void generateMiniStatement() {
		int count=5;
		if(statement.size()==0) {
			System.out.println("there are no transactions happened");
			return;
		}
		System.out.println("============List 5 transaction =============");
		for(String trans:statement) {
			if(count==0) {
				break;
			}
			System.out.println(trans);
			count--;
		}
		Collections.reverse(statement);
	}

}
