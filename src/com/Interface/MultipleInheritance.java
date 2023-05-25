package com.Interface;

interface innova
{
	abstract String carDetails(String color,int gears,int maxSpeed);
	default void function()
	{
		System.out.println("-Normal car for Family use.");
		System.out.println("-Seven seater car.");
		System.out.println("-It contains Manual gearing system.");
	}
	
}
interface BMW
{
	abstract String carDetails(String color,int gears,int maxSpeed);
	default void function()
	{
		System.out.println("-Racing car .");
		System.out.println("-Two seater car.");
		System.out.println("-It contains automated gearing system.");
	}
	
}
class Car implements innova, BMW
{
    
	@Override
	public String carDetails(String color,int gears, int maxSpeed) {
		String carColor=color;
		int Gears=gears;
		int MaxSpeed=maxSpeed;
		
		return "Car Color : "+carColor+"     No. of Gears : "+Gears+"    Maximum speed : "+MaxSpeed;
	}

	@Override
	public void function() {
		innova.super.function();
		BMW.super.function();
	}
	public void innovaFun()
	{
		innova.super.function();
	}
	public void bmwFun()
	{
		BMW.super.function();
	}
     
	
    
	
	
}
public class MultipleInheritance  {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println("Innaova Details :");
		System.out.println(c.carDetails("White", 5, 240));
		System.out.println("Innova Function :");
		c.innovaFun();
		System.out.println(" ");
		System.out.println("BMW Details :");
		System.out.println(c.carDetails("Black", 2, 280));
		System.out.println("BMW Function :");
		c.bmwFun();
		
	}

}
