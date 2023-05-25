package com.JavaIntroduction;

public class MainStatic1 {
	public static void main(String ards[])
	{    
		Static1 st1=new Static1();
		System.out.println("Hello...");
		
		/* In same class we no need to call static  variables and methods, but when we are calling 
		  from another class name or reference of class to call Static variable and methods.mostly
		  we should class (class name.static variable or method Name) refer pgm Static1 and 
		  MainStatic1 static variables and methods execute before main method. and to call from 
		  anothet class declare them with public(make visible)s
		 */
		
	     System.out.println("Static var value : "+Static1.varStatic);
	     Static1.staticMethod();  
	     Static st=new Static();
	     System.out.println("Normal var value : "+st1.varNormal);
	     st1.normalMethod();
	     
	}

}
