package com.homework.interfaces;

import com.homework.atmexceptions.InsufficientFundsException;
import com.homework.atmexceptions.InsufficientMachineBalanceException;
import com.homework.atmexceptions.InvalidAmountException;
import com.homework.atmexceptions.NotAOperatorException;

public interface IATMService {
	//to get the user type wheatehr the user is operator or normal user
	public abstract String getUserType() throws NotAOperatorException;
	//to withdraw an amount 
	//1. will throw invalid if the amount is not a valid denomination
	//2. will throw insufficient funds exceptions if the customer has insufficient amount in his account
	//3.will throw machine balance exception if the machine has insufficient cash.
	public abstract double withdrawAmount(double wthAmounnt) throws InvalidAmountException,InsufficientFundsException,
																	InsufficientMachineBalanceException;
	
	public abstract void depositAmount(double dptAmount) throws InvalidAmountException;
	
	//
	public abstract double checkAccountBalance();
	
	public abstract void changePinNumber(int pinNumber);
	
	public abstract int getPinNumber();
	
	public abstract String getUserName();
	
	public abstract void decreaseChances();
	
	public abstract int getChances();
	
	public abstract void resetPinChances();
	
	public abstract void generateMiniStatement();
	

}
