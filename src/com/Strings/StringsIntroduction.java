package com.Strings;

import org.openjdk.jol.vm.VM;

public class StringsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello world";// called string literal declaration
		System.out.println("Addres of str while declaration : "+VM.current().addressOf(str));
		
		String str1=new String("Welcome to java programming");//string object declaration
		
		str="this is java programming";
		System.out.println("Addres of str after update : "+VM.current().addressOf(str));
		
		String str2="Hello world";
		/*
		 here str2 map to the hello world which was assigned to str earlier because str is assigned
		 by another value.so the address of str2 and the address of str before update is same. 
		 */
		
		/*
		 string literal variables stored in string constant pool , variables declared using object
		 are stored in heap memory
		 */
		System.out.println("Addres of str2 while declaration : "+VM.current().addressOf(str2));
		
		System.out.println("Addres of str1 while declaration : "+VM.current().addressOf(str1));
		
		char ar[]= {'w','e','l','c','o','m','e'};
		String str3=new String(ar);
		System.out.println(str3);
	}

}
