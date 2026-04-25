package com.codegnan.exceptions;

public class ElectionVoteEligibility {
	
	public void checkEligibility(int age) throws NotEligibleException {
		if(age<18) {
			throw new NotEligibleException("you are not eligible to vote");
		}else {
			System.out.println("you have right to vote");
		}
	}
	

	public static void main(String[] args)  {
		
		ElectionVoteEligibility checker=new ElectionVoteEligibility();
		try {
			checker.checkEligibility(17);
		} catch (NotEligibleException e) {
						e.printStackTrace();
		}
		
		
		
	}

}
