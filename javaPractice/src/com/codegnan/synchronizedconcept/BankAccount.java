package com.codegnan.synchronizedconcept;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public synchronized void withdraw(String user,double amount) { //synchronised methods
		System.out.println(user+" trying to withdraw "+amount);
		
		if(balance>=amount) {
			
			System.out.println(user +" processing the withdrawl amount");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			balance-=amount;
			System.out.println(user+" completed withdrawn remaining balance"+balance);
		}else {
			System.out.println(" insufficient funds available nbalance"+balance);
		}
		System.out.println("---------------------");
	}
	
}
