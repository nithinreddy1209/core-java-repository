package com.JavaInheritance;

class Parent
{
	void show()  //Overridden method
	{
		System.out.println("Parent's show method");
	}
}


class Child extends Parent
{
	void show() //Overriding method
	{
		System.out.println("Child's show method");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
        
		Parent ob=new Parent();
		ob.show();
		
		
		Parent ob1=new Child(); 
		//If a parent type reference refers to a Child object then child's method 
		//will be called. This is called Runtime Polymorphism
		ob1.show();
		
		//Child c=new Parent();  error occurs
		


	}

}
