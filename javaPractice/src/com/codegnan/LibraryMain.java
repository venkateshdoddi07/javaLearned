package com.codegnan;

public class LibraryMain {

	public static void main(String[] args) {

		PrintedBook b1=new PrintedBook(1, "java", "gosling",3);
		
		Ebook e1=new Ebook(2, "python", "venk", 5.5);
		
		int daysLate=5;
		
		b1.displayDetails();
		b1.showFine(daysLate);
		
		System.out.println();
		
		e1.displayDetails();
		e1.showFine(daysLate);
	}

}
