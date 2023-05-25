package com.ExceptionHandling;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20, c=0;
		String st="Hello World";
		try
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(a+b);
			System.out.println(b+c);
			System.out.println(b/a);
			System.out.println(a*b);
			System.out.println(st.length());//NullPoinetrException
			System.out.println(b/c);
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e ) //Generic exception
		{
			System.out.println(e.getMessage());
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
