package com.Strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String : ");
	    String str=sc.nextLine();
	    String rev="";
	    
	    int i,j;
	    boolean check=true;
	    for(i=(str.length()-1);i>=0;i--)
	    	
	    { 
	    	rev=rev+str.charAt(i);
	    }
	    if(str.equals(rev))
	    {
	    	System.out.println("It is palindrome");
	    }
	    else
	    {
	    	System.out.println("Not palindrome");
	    }
	}

}
