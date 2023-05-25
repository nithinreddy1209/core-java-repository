package com.JavaIntroduction;

public class BookInformation {

	int id; 
	String bookName;
	String authorName;
	int price;
	int pages;
	String publicationName;
	String isbnNumber; 
	
    public void bookDetails()
    {
    	System.out.println("book id          : "+id);
    	System.out.println("Book Name        : "+bookName);
    	System.out.println("Author Name      : "+authorName);
    	System.out.println("Book Price       : "+price);
    	System.out.println("No. of Pages     : "+pages);
    	System.out.println("publication Name : "+publicationName);
    	System.out.println("ISBN Number      : "+isbnNumber);
    	System.out.println(" ");
    }
    public static void main(String args[])
    {
    	BookInformation obj1= new BookInformation();
    	obj1.id=5473;
    	obj1.bookName="the revolution";
    	obj1.authorName="samuel river";
    	obj1.price=999;
    	obj1.pages=750;
    	obj1.publicationName="ebook distributor";
    	obj1.isbnNumber="Eb654321";
    	obj1.bookDetails();
    	
    	BookInformation obj2= new BookInformation();
    	obj2.id=9125;
    	obj2.bookName="The evolution";
    	obj2.authorName="padmabusion";
    	obj2.price=1499;
    	obj2.pages=1200;
    	obj2.publicationName="Sia distributor";
    	obj2.isbnNumber="SIA01567";
    	obj2.bookDetails();
    	
    }
}
