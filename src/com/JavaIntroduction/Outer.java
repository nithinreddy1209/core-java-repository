package com.JavaIntroduction;

public class Outer {
	
	
		
		   private static String str="Hello World"; //static data member
		   private String str1="Hii";//non-static data member
		   
		   
		   static class Inner  //Nested static class
		   {
			   public void display()
			   {
				   System.out.println("This is non static method");
				   System.out.println(str);
				  // System.out.println(str1); error
			   }
			   
			   static public void test()
			   {
				   
				   System.out.println("This is static method");
				   
				   System.out.println(str);
				   //System.out.println(str1);
				   
			   }
			   /*In static class both static and non static methods of acceptable, but non static
			     variables are not accepted where static variables are acceptable
			    
			    */
		   }
		   
		   
		   public static void main(String args[])
		   {
			   Outer.Inner obj=new Outer.Inner();
			   
			   obj.display();
			   obj.test();
		   }

}
