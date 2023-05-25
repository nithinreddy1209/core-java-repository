package com.JavaIntroduction;

public class Static {

	private static int var=10;
	private int varN=20;
	
	public static void staticMethod()
	{
		var=30;
		//varN=40; static method accepts only static variables
		System.out.println("This is Static Method...");
		System.out.println("modified static variable : "+var);
	}
	public void normalMethod()
	{
		System.out.println("This is Normal Method...");
	}
     
	public static void main(String ards[])
	{
		/* In same class we no need to call static  variables and methods, but when we are calling 
		  from another class name or reference of class to call Static variable and methods.mostly
		  we should class (class name.static variable or method Name) refer pgm Static1 and 
		  MainStatic1 and static variables and methods execute before main method.
		 */
		Static st=new Static();
		
    	System.out.println("welcome");
	     System.out.println("Static var value : "+var);
	     staticMethod();  
	     
	     System.out.println("Normal var value : "+st.varN);
	     st.normalMethod();
	     
	}
	

}
