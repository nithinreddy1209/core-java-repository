package com.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserDefinedException2 {
	
	List<String> student;

	

	public UserDefinedException2() 
	{
		student = new ArrayList<>();
		student.add("Nithin");
		student.add("Balaji");
		student.add("Sai kiran");
		student.add("Rahul");
	}
	
	public void check(String name) throws StudentDataNotFoundException
	{
		if(this.student.contains(name))
		{
			System.out.println("Valid Student Name");
		}
		else
		{
			throw new StudentDataNotFoundException("Invalid Student Name");
		}
	}
	
	public static void main(String args[])
	{
		UserDefinedException2 ob=new UserDefinedException2();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String stuName=sc.next();
		
		try {
			ob.check(stuName);
		} catch (StudentDataNotFoundException e) {
			
			System.out.println(e);
		}
		
	}

}
