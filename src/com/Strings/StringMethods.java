package com.Strings;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner scan=new Scanner(System.in); 	
		//static input
	   String st=new String("Welcome to string programming");	
	   String st1=new String(" in Java");	
	   //String st1=scan.nextLine();
	   String st2="welcome to string programming";
	   
	   System.out.println(st.length());   //29
	   System.out.println(st.charAt(0));  //W
	   System.out.println(st.concat(st1));
	   System.out.println(st.toLowerCase());
	   System.out.println(st.toUpperCase());
	   System.out.println(st.indexOf('c'));//3
	   System.out.println(st.lastIndexOf('m'));
	   System.out.println(st.contains("to"));
	   System.out.println(st.equals(st2));
	   System.out.println(st.equalsIgnoreCase(st2));
	   System.out.println(st.contentEquals(st2));
	   System.out.println(st2.endsWith("ing"));
	   System.out.println(st.compareTo(st1));
	   
	   //Welcome to string programming
	   // in Java
	   
	   //'W' - 87, ' '- 32   (87-32)=55
	   
	   System.out.println(st.substring(5));
	   System.out.println(st.substring(3,7));

	}

}
