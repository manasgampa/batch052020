package com.antra;

//example of immutable class
public final class Book {
	
	private final int bookId;
	private final String bookName;

	public Book(int bookId,String bookName) {
		this.bookId=bookId;
		this.bookName=bookName;
	}

	public Book modify(int bookId,String bookName) {
		
		
		return new Book(bookId,bookName);
	}
	
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	
	
	
	
	
}
