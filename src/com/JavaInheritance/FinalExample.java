package com.JavaInheritance;

class Test1
{
	final int a=100; //constant
	final int c=200;
	 void setValue()
	{
		//a=200;
		System.out.println(a);         // i)stop the value change of the variable 
									   // ii)stop overriding
									   // iii)Stop inheritance
    }
	 final void sample()
	 {
		 System.out.println("this is final method..");
	 }
	
	// we can call super class final variables and methods using child class reference
}

class Demo1 extends Test1
{
	int b=60;
	 void setValue()
	{
		//a=200;
		System.out.println(b);
	}
}
public class FinalExample {

	public static void main(String[] args) {
		
		Test1 ob=new Test1();
		ob.setValue();
		Demo1 d=new Demo1();
		System.out.println("Child class normal var : "+d.b+"     super class final var : "+d.c);
		d.sample();

	}

}
