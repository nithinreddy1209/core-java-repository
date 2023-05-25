package com.ExceptionHandling;

import java.util.Scanner;

class User
{
	long pinCode;
	long accBal;
	long pin;
	long amount;
	
	public User(long pinCode, long accBal) {
		
		this.pinCode = pinCode;
		this.accBal = accBal;
	}

	public void check(Object ob) throws InvalidInputException
	{
		System.out.println("Enter PIN : ");
		pin=((Scanner)ob).nextLong();
		if(pin!=pinCode)
		{
			throw new InvalidInputException("Invalid PIN");
			
		}
		else
		{
			System.out.println("Enter amount");
			amount=((Scanner)ob).nextLong();
		
		
		    if(amount>accBal)
		    {
			    throw new InvalidInputException("Insufficient Funds");
		    }
		    else
		    {
			    System.out.println("Amount withdrawn successfully");
			    accBal=accBal-amount;
			    System.out.println("Remaining account Balance : "+accBal);
		    }
		}
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		User u=new User(7660,25000);
		try {
			u.check(sc);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
