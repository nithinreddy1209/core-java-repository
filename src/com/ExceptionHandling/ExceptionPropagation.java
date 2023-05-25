package com.ExceptionHandling;

public class ExceptionPropagation

{
    public void method1()
    {
	    System.out.println("method 1 invoked...");
	    System.out.println(10/0);
	    
    }
	public void method2()
	{
		method1();
		System.out.println("method 2 invoked...");
		
	}
	public void method3()
	{
		try 
		{
		    method2();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("method 3 invoked...");
		
	}
	/*
	 * Exception Propagation check for the exception from top to bottom approach
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ExceptionPropagation ob=new ExceptionPropagation();
	     ob.method3();

	}

}
