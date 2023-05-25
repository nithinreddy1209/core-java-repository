package com.ThreadProgramming;

class Multiplication extends Thread
{
	int n;

	public Multiplication(int n) {
		
		this.n = n;
		
	}


	
	public void table() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
		
		
	}
	
	
	
}

public class ThreadSynchronizationMethod {

	public static void main(String[] args) {
		
		Multiplication m1=new Multiplication(5);
		Multiplication m2=new Multiplication(10);
		
		m1.table();
		m2.table();
		
		
		

	}

}
