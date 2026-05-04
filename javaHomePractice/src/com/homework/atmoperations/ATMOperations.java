package com.homework.atmoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.homework.atmexceptions.IncorrectPinLimitReachedException;
import com.homework.atmexceptions.InsufficientMachineBalanceException;
import com.homework.atmexceptions.InvalidAmountException;
import com.homework.atmexceptions.InvalidCardException;
import com.homework.atmexceptions.InvalidPinException;
import com.homework.atmexceptions.NotAOperatorException;
import com.homework.interfaces.IATMService;

public class ATMOperations {
	//initial ATM machine balance
	public static double ATM_MACHINE_BALANCE=1000000.00;
	
	//List to keep track all activities performed on the ATM .
	
	public static ArrayList<String>Activity=new ArrayList<>();

		//database to map card numbers  and card objects.(key value pairs)
	public static HashMap<Long,IATMService>database=new HashMap<>();
	//flag to indicate if the ATM machine is on or off
	public static boolean MACHINE_ON=true;
	
	//reference to current card in use
	public static IATMService card;
	
	//validate the inserted card by checking against database
	public static IATMService validateCard(Long cardNumber) throws InvalidCardException{
		if(database.containsKey(cardNumber)) {
			return database.get(cardNumber);
		}else {
			Activity.add("accessed by :"+ cardNumber+"is not compatible");
			throw new InvalidCardException("this is not a valid card");
		}
		
	}
	
//displayactivities pereformed on the machine
	public static void checkATMMachineActivities() {
		System.out.println("============Activities performed========================");
		for(String activity:Activity) {
			System.out.println(activity);
			System.out.println("-----------------------------------------------------");
		}
	}
	public static void resetUserAttempts(IATMService OperatorCard) {
		IATMService card =null;
		long number;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your card numberL: ");
		number=scanner.nextLong();
		try {
			card=validateCard(number);
			card.resetPinChances();
			Activity.add("Accessed by" +OperatorCard.getUserName()+"to reset number of chances for user");
		}catch(InvalidCardException e) {
			e.printStackTrace();
		}
	}

	
	public static IATMService validateCredentials(long cardNumber,int pinNumber) 
		throws InvalidPinException,InvalidCardException,IncorrectPinLimitReachedException{
			if(database.containsKey(cardNumber)) {
				card=database.get(cardNumber);
			}else {
				throw new InvalidCardException("this card is not a valid card");
			}
			try {
				if(card.getUserType().equals("operator")) {
					if(card.getPinNumber()!=pinNumber) {
						throw new InvalidPinException("dear opperator please eneter correct pin number");
					}else {
						return card;
					}
				}
			}catch(NotAOperatorException | InvalidPinException e) {
				e.printStackTrace();
			}
			
			//valid pin handle incorrect attempts
			if(card.getChances()<=0) {
				throw new IncorrectPinLimitReachedException("you have reached limt of wrong pin number 3 attempt");
			
		}if(card.getPinNumber()!=pinNumber) {
			card.decreaseChances();
			throw new InvalidPinException("u have entered a wrong pin nmber");
		}else {
			return card;
		}
		
		
	}
	
	public static void withdrawAmount(double amount) throws InsufficientMachineBalanceException{
		if(amount>ATM_MACHINE_BALANCE) {
			throw new InsufficientMachineBalanceException("insufficient cash in machine");
		}
	}
	public static void validDepositAmount(double Amount) throws InvalidAmountException,InsufficientMachineBalanceException{
		if(Amount%100!=0) {
			throw new InvalidAmountException("please deposit multiple of 100");
		}
		if(Amount+ATM_MACHINE_BALANCE>2000000.00) {
			Activity.add("unable to deposit cash in machine");
			throw new InsufficientMachineBalanceException("u can't deposit cash limit of machine is reached");
			
		}
	}
	public static void main(String[] args) {
		

		
	}

}
