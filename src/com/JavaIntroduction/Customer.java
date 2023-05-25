package com.JavaIntroduction;

public class Customer {
	//class is a template or blueprint to create objects
	
		//properties / instance variables
		int id;
		String name; 
		String address;
		long phone;
		String email;
		
		
		//methods
		public void viewProduct()
		{
			System.out.println("This is view product method");
		}
		
		public void addProduct()
		{
			System.out.println("This is add product method");
		}
		
		public void placeOrder()
		{
			System.out.println("This is place order method");
		}
		
		
		public static void main(String args[])
		{
			Customer ob=new Customer();
			ob.id=7578958;
			ob.name="Mr. Raman";
			ob.phone=988888;
			ob.address="Mumbai";
			ob.email="raman@gmail.com";
			ob.addProduct();
			ob.placeOrder();
			ob.viewProduct();
			System.out.println(ob.id + " "+ob.name+" "+ob.phone);
			
			
			Customer ob1=new Customer();
			ob1.id=5676576;
			ob1.name="Mr. KUmar";
			ob1.phone=9888000;
			ob1.address="Chennai";
			ob1.email="kumar@gmail.com";
			ob1.addProduct();
			ob1.placeOrder();
			ob1.viewProduct();
			System.out.println(ob1.id + " "+ob1.name+" "+ob1.phone);
		}
		

}
