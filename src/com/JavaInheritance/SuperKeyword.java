package com.JavaInheritance;

class Library
{
	private String LName;
	private String LAddress;
	
	public Library() {
		System.out.println("This is super class default constructor...");
	}

	public Library(String lName, String lAddress) {
		super();
		LName = lName;
		LAddress = lAddress;
	}
	void getDetails1()
	{
		System.out.println("Library Name : "+LName);
		System.out.println("Library Address : "+LAddress);
	}

}

class Book extends Library
{
	private String BName;
	private int bookId;
	public Book() {
		super();
		
	}
	public Book(String lName, String lAddress,String bName,int bookId) {
		super(lName, lAddress);
		this.BName=bName;
		this.bookId=bookId;
	}
	void getDetails2()
	{
		System.out.println("Book Name : "+BName);
		System.out.println("Book Id : "+bookId);
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Book b=new Book("ABC Library","hyderabad","java programming",318);
		b.getDetails2();
		b.getDetails1();

	}

}
