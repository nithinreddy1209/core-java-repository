package com.JavaIntroduction;

public class Account {
	public String id;
	public String name;
	public int balance=0;
	public int myBalance;
	
	public Account(String id, String name )
	{
		this.id=id;
		this.name=name;
	}
    
	public Account(String id, String name,int balance )
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public Account(int myBalance)
	{
		this.myBalance=myBalance;
		
	}

	public String getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	
	public int getBalance() {
		return balance;
	}

	public int credit( int amount)
	{
		balance=balance+amount;
		return balance;
	}
	public int debit(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	
	}
	public int amount;
	public int addBalance=0;
	
	public int transferTo( Account another,int amount)
	{
		this.amount=amount;
		if(this.amount<=balance)
		{
			
			balance=balance-this.amount;
			addBalance=addBalance+this.amount;
		}
		else
		{
		      System.out.println("Amount exceeded balance");
		}
		
		return balance;
		
	}
	
	
	
   
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	
	
	
}
