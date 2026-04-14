package com.codegnan;

public class Book {
	int bookId;
	String title;
	String author;
	
	public Book(int bookId,String title,String author) {
		
		super();
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	
	public void displayDetails() {
		System.out.println("book Id is: "+bookId);
		System.out.println("title is: "+title);
		System.out.println("author is: "+author);
		
	}
	
	public double calculateFine(int daysLate,double finePerDay){
		
		return daysLate*finePerDay;
		
	}
	public double calculateFine(int daysLate) {
		return daysLate*2;
		
	}
	

}
