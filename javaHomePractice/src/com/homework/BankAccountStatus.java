
/*Q8)
 Bank Account Status Check
Problem:
 Write a Java program to check the account balance and classify it:
"Good Standing" if the balance is greater than or equal to $1000
"Low Balance" if the balance is between $500 and $999
"Account Overdrawn" if the balance is less than $500*/



package com.homework;
import java.util.Scanner;

public class BankAccountStatus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        System.out.println("Enter the mode of transaction: deposit / withdraw / check");
        String option = scanner.nextLine();

        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();

        // Using ternary operator for transaction
        balance = option.equalsIgnoreCase("deposit") ? balance + amount :
                  option.equalsIgnoreCase("withdraw") ? balance - amount :
                  balance;

        System.out.println("Current Balance: $" + balance);

        // Using ternary operator for classification
        String status = (balance >= 1000) ? "Good Standing" :
                        (balance >= 500) ? "Low Balance" :
                        "Account Overdrawn";

        System.out.println("Status: " + status);

        scanner.close();
    }
}
