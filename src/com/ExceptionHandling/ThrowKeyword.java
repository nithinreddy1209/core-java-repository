package com.ExceptionHandling;
import java.util.Scanner;

class Throw
{
	public void display(Object ob)
	{
		System.out.println("Enter value of a : ");
		int a=((Scanner)ob).nextInt();
		System.out.println("Enter value of b : ");
		int b=((Scanner)ob).nextInt();
		
		if(b==0)
		{
			try
			{
			    throw new ArithmeticException("Cannot divide by 0");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Result : "+a/b);
		}
	}
	

	
}

public class ThrowKeyword 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Throw t=new Throw();
        t.display(sc);
	}

}
