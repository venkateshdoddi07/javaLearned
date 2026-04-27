package com.codegnan.synchronizedconcept;

public class AtmTest {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount(100000);
		UserA a=new UserA(account);
		UserB b=new UserB(account);
		UserC c=new UserC(account);
		Thread t1=new Thread (a,"UserA");
		Thread t2=new Thread (b,"UserB");

		Thread t3=new Thread (c,"UserC");
		t1.start();
		t2.start();
		t3.start();

		
	}

}
