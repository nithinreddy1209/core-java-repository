package com.ExceptionHandling;
import java.io.*;
import java.util.Scanner;
class Throws
{
	public void add(Object ob) throws NumberFormatException, IOException
	{
		/*
		 * throws keyword should mandatory in checked exception,In unchecked exception it was not
		 * mandatory but if we want ,we can declare
		 */
		System.out.println("Enter value of a : ");
		int a=Integer.parseInt(((BufferedReader)ob).readLine());
		System.out.println("Enter value of b : ");
		int b=Integer.parseInt(((BufferedReader)ob).readLine());
		System.out.println("Result : "+(a+b));
	}
}

public class ThrowsKeyword {

	public static void main(String[] args)// throws NumberFormatException, IOException //optional
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Throws t=new Throws();
        try {
			t.add(br);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} 
        //If we use throws then try-catch is not required. if we use try-catch then throws is 
        //not required
	}

}
