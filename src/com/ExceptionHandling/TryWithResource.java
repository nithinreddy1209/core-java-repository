package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//resource
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		try(br)
		{
			System.out.println("Enter a number");
			int n=Integer.parseInt(br.readLine()); //checked exception
			int fact=1,i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
				
			}
		
		System.out.println("Factorial:"+fact);
		}
		catch(Exception e)
		{
			System.out.println();
		}
		finally
		{
			
		}
	}

}
