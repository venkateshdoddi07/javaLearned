package com.codegnan.exceptions;

public class MarriageEligibilityChecker {
	
	public void checkEligibility(int age) throws TooYoungException, TooOldException{
		if(age<18) {
			throw new TooYoungException("marriage cannot be approved , age is below 18 years");
			
		}else {
			if(age>60) {
				throw new TooOldException("Marriage cannot be aproved , age is above 60 years");
			}else {
				System.out.println("marriage aproved and details will be emailed soon");
			}
		}
	}

	public static void main(String[] args) {
		
		
		MarriageEligibilityChecker checker =new MarriageEligibilityChecker();
		
		try {
			checker.checkEligibility(201);
		} catch (TooYoungException | TooOldException e) {
				e.printStackTrace();
		}
	}

}
