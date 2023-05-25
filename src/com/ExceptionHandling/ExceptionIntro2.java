package com.ExceptionHandling;

public class ExceptionIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=0;
		String st=null;
		try
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a+b);
			System.out.println(b+c);
			System.out.println(b/a);
			System.out.println(a*b);
			
			try {
			     System.out.println(st.length());//NullPoinetrException
			}
		    catch(NullPointerException e)
		    {
			     System.out.println(e);
		    }
			System.out.println(b/c);//Arithmetic Exception
		
			/*
			 * nested try and catch block is always before the another exception raised stmt.
			 */
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		
			//Rest of the code
			System.out.println(a++);
			System.out.println(b--);
			System.out.println(a+b+c);
		}
		
		
	}

}
