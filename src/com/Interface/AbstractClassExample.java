package com.Interface;

abstract class Area
{
	
	 String color;
	 
	 public Area(String color) {
		
		this.color = color;
	}
	abstract double area();    //abstract method
	 public abstract String getString();  //abstract method
	 String getColor()   // Non abstract method
	 {
		 return this.color;
	 }
}
class Circle extends Area
{
    double radius;
    
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public String getString() {
		
		return super.getColor()+"   "+area();// string type function can accepts any type of return values.
		//but string cannot convert into other type.
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		Area a=new Circle("Red",12.56);
		System.out.println(a.getString());

	}

}
