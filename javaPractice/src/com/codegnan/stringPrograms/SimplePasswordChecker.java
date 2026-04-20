package com.codegnan.stringPrograms;

public class SimplePasswordChecker implements PasswordChecker {
	

	@Override
	public  String checklength(String password) {
		//System.out.println(" the  length is : "+password.length());
		return "Length" + password.length();
				
	}

	@Override
	public  String checkComplexity(String password) {
		if(password.length()<8) {
			//System.out.println("weak password");
			return "weak";
		}else {
			if(password.length()==8) {
				//System.out.println("Medium password");
				return "medium";
				
				
			}else {
				if(password.length()>8 ) {
					//System.out.println("Strong password");
					return "strong";
				}else {
					return "other";
				}
			}
		}
		
				
	}

}
