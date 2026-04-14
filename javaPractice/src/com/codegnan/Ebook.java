package com.codegnan;

public class Ebook extends Book{
	double fileSize;

	public Ebook(int bookId, String title, String author,double fileSize) {
		super(bookId, title, author);
		this.fileSize=fileSize;
	}
	

	
	public void showFine(int daysLate) {
		double fine=calculateFine(daysLate);
		System.out.println("ebook fine "+fine);
		
	}

}
