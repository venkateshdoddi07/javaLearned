//1.(a) Formula to convert Celsius to Fahrenheit
 // celsius * 9 / 5 + 32 involves implicit type casting from int to double

//1.(b)  // Formula to convert Fahrenheit to Celsius
      // (fahrenheit - 32) * 5 / 9)   

import java.util.Scanner;

public class TemperatureConversion{

public static void main (String[] args){
	Scanner scanner=new Scanner(System.in);

			System.out.println("Choose the conversion");
			System.out.println("celsius or farenheit");
			String TemperatureSelection =scanner.next();

		if(TemperatureSelection.equals("celsius")){
			
			//the below program is converting from celsius to fahrenheit						
			System.out.println(" Enter celsius temperature");
		
			int celsius=scanner.nextInt();
			double fahrenheit=((celsius *9/5)+32);
				System.out.println(" celsius to fahrenheit successfully converted and result is : " + fahrenheit);
			System.out.println();
	       }else if(TemperatureSelection.equals("farenheit")){

			//the below program is converting from fahrenheit to celsius
			System.out.println(" Enter Fahrenheit temperature");
			
			double fahrenheit1=scanner.nextDouble();
				int celsius1=(int)((fahrenheit1-32)*5/9);
				System.out.println(" fahrenheit1 to celsius successfully converted and result is : " + celsius1);
		    }else{
			System.out.println(" you have enter wrong choice ");
}
}
}
