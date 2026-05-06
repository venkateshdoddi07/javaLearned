package com.homework.atmoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.homework.atmcards.AxisDebitCard;
import com.homework.atmcards.HdfcDebitCard;
import com.homework.atmcards.KotakDebitCard;
import com.homework.atmcards.OperatorCard;
import com.homework.atmcards.SbiDebitCard;
import com.homework.atmexceptions.IncorrectPinLimitReachedException;
import com.homework.atmexceptions.InsufficientMachineBalanceException;
import com.homework.atmexceptions.InsufficientFundsException;
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
			throw new InsufficientMachineBalanceException("you can't deposit cash limit of machine is reached");
			
		}
	}
	public static void operatorMode(IATMService card) {
		Scanner scanner=new Scanner(System.in);
		double amount;
		boolean flag=true;
		while(flag) {
			System.out.println("operator mode: operator name: "+card.getUserName());
			System.out.println("||=================================================================||");
			System.out.println("||=======1. switch off the machine=================================||");
			System.out.println("||=======2. to check ATM machine balance===========================||");
			System.out.println("||=======3.deposit cash in a machine===============================||");
			System.out.println("||=======4.reset the user pin attempts======================================||");
			System.out.println("||=========5.to check activities performed in the machine===================||");
			System.out.println("||=========6.exit operator mode===============");
			System.out.println("please enteer your choice");
			int option=scanner.nextInt();
			switch(option) {
			case 1:
				MACHINE_ON=false;
				Activity.add("accessed by "+card.getUserName()+"Activity performed . switching  off the ATM machine");
				flag=false;
				break;
				
			case 2:
				Activity.add("Accessed by"+card.getUserName()+"Activity performed. checking atm machine balance");
				System.out.println("the balance of the ATM machine is: "+ATM_MACHINE_BALANCE+"is available");
				break;
			case 3:
				System.out.println("Enter the amount to deposit: ");
				amount=scanner.nextDouble();
				try {
					
				validDepositAmount(amount);
				ATM_MACHINE_BALANCE+=amount;
				Activity.add("Accessed by"+card.getUserName()+"Activity performed. checking atm machine balance");
				System.out.println();
				System.out.println("cash added in t he atm machine");
				System.out.println();
				}catch(InvalidAmountException | InsufficientMachineBalanceException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				resetUserAttempts(card);
				System.out.println();
				System.out.println("user attempts arer reset");
				System.out.println();
				Activity.add("Accessed by" +card.getUserName()+"Activity performed. checking atm machine balance");
				break;
				
			case 5:
				checkATMMachineActivities();
				break;
			case 6:
				flag=false;
				break;
			default:
				System.out.println("you have entered a wrong option");
				
			}
			
				
		
		}
	}
	public static void main(String[] args) throws NotAOperatorException {
		
		database.put(123456789012l, new AxisDebitCard("raju",123456789012l,50000.00,2222));
		database.put(333333339012l, new SbiDebitCard("mani",333333339012l,4000.00,3333));
		database.put(444446789012l, new KotakDebitCard("venk",444446789012l,20000.00,4444));
		database.put(555556789012l, new HdfcDebitCard("sri",555556789012l,90000.00,5555));
		database.put(111111111111l, new OperatorCard(1111,111111111111l,"operator"));
		Scanner scanner=new Scanner(System.in);
		long cardNumber=0;
		double depositAmount=0.0;
		double withDrawAmount=0.0;
		int pin=0;
		while(MACHINE_ON) {
			System.out.println("Please enter debit card number");
			cardNumber=scanner.nextLong();
			System.out.println("Enter pin number");
			pin=scanner.nextInt();
			try {
			card=validateCredentials(cardNumber,pin);
			if(card==null) {
				System.out.println("card valid fail");
				continue;
			}
			Activity.add("accessed by :"+card.getUserName()+"status: access approved");
			if(card.getUserType().equals("operator")) { 
				
				operatorMode(card);
				continue;
			}
			while(true) {
				System.out.println("User mode: "+card.getUserName());
				System.out.println("================================");
				System.out.println("=====1. withdraw amount==========");
				System.out.println("=====2. deposit amount==========");
				System.out.println("=====3. check balance==========");
				System.out.println("=====4. change pin============");
				System.out.println("======5.mini statement========");
				System.out.println("========================================");
				System.out.println("enter your choice");
				int option=scanner.nextInt();
				try {
					switch(option) {
					case 1:
						System.out.println("please enter the amount to withdraw");
						withDrawAmount=scanner.nextDouble();
						card.withdrawAmount(withDrawAmount);
						ATM_MACHINE_BALANCE-=withDrawAmount;
						Activity.add("accessed by: "+card.getUserName()+"activity: "+"amount with drawn");
						break;
						
					case 2:
						System.out.println("please emnter to reposit");
						depositAmount=scanner.nextDouble();
						validDepositAmount(depositAmount);
						ATM_MACHINE_BALANCE+=depositAmount;
						card.depositAmount(depositAmount);
						Activity.add("accessed by: "+card.getUserName()+"activity: "+"amount depositd");
						break;
						
					case 3:
						System.out.println("yu account balance is: "+ card.checkAccountBalance());
						break;
						
					case 4:
						System.out.println("enter new pin");
						pin=scanner.nextInt();
						card.changePinNumber(pin);
						Activity.add("assced by : "+card.getUserName()+"activity");
						card.generateMiniStatement();
						break;
						
					case 5:
						Activity.add(
								"Accessed By : " + card.getUserName() + " Activity : " + "Generating statement");
						card.generateMiniStatement();
						break;
					default:
						System.out.println("u have entere wrong option");
						break;
						
					}
					System.out.println("do u want to continue(y/n)");
					String nextOption=scanner.next();
					if(nextOption.equalsIgnoreCase("n")) {
						break;
					}
				}catch(InvalidAmountException | InsufficientFundsException
						| InsufficientMachineBalanceException e) {
					e.printStackTrace();

				}

			}
		}catch(InvalidPinException | InvalidCardException | IncorrectPinLimitReachedException e) { //issue
				e.printStackTrace();
				
			}
		}
		
		System.out.println("===============================================");
		System.out.println("===== Thank you for using HDFC ATM Machine=====");
		System.out.println("===============================================");
	}

}
