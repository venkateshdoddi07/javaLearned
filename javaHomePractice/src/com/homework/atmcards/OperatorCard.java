package com.homework.atmcards;

import com.homework.atmexceptions.InsufficientFundsException;
import com.homework.atmexceptions.InsufficientMachineBalanceException;
import com.homework.atmexceptions.InvalidAmountException;
import com.homework.atmexceptions.NotAOperatorException;
import com.homework.interfaces.IATMService;

public class OperatorCard implements IATMService{
	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	

	public OperatorCard(int pinNumber, long id, String name) {
		super();
		this.pinNumber = pinNumber;
		this.id = id;
		this.name = name;
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
				return type;
	}

	@Override
	public double withdrawAmount(double wthAmounnt)
			throws InvalidAmountException, InsufficientFundsException, InsufficientMachineBalanceException {
		
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
				
	}

	@Override
	public double checkAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateMiniStatement() {
		// TODO Auto-generated method stub
		
	}
	
	

}
