package com.cg.library.model;

public class Book {
	private int bookCode;
	private String title;
	double price;
	
	
	
	public Book() {
		super();
	}
	
	
	public Book(int bookCode, String title, double price) {
		super();
		this.bookCode = bookCode;
		this.title = title;
		this.price = price;
	}
	
	
	
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", title=" + title + ", price=" + price + "]";
	}
}
