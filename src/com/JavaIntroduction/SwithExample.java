package com.JavaIntroduction;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class SwithExample {

	public static void main(String[] args) throws NumberFormatException,IOException
	{
		
		
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		do
		{
		    System.out.println("Enter any number between 1 to 7 : ");
		    int day=Integer.parseInt(br.readLine());
		
		
		    switch(day)
		    {
		         case 1 : System.out.println("Sunday");
		                 break;
		
		         case 2 : System.out.println("Monday");
                         break;  
		
		         case 3 : System.out.println("Tuesday");
                         break;
		
		         case 4 : System.out.println("Wednesday");
                         break;
		
		         case 5 : System.out.println("Thursday");
                         break;
		
		         case 6 : System.out.println("Friday");
                         break;
		 
		         case 7 : System.out.println("Saturday");
                         break;
                 
                 default : System.out.println("invalid...!");         
     		}
		    System.out.println("To Exit type 'E' or To Continue press 'Enter'");
		    String Exit=br.readLine();
		   
		   
		   if(Exit.equals("E"))
		   {
			   break;
		   }
		   
		}while(true);   
		System.out.println("Ended...!");

	}

}
