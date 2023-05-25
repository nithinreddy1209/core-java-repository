package com.JavaIntroduction;

public class Circle {
	
	private double radius=1.0;
	
	
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	
	public double getCircumference()
	{
		return 2*Math.PI*radius;
		
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
		
	}
	public static void main(String args[])
	{
		Circle obj1=new Circle();
		obj1.setRadius(1.265788);
		System.out.println("Area of a circle="+obj1.getArea());
		System.out.println("circumference of a circle="+obj1.getCircumference());
		System.out.println(" ");
		Circle obj2=new Circle(5.467657);
		System.out.println("Area of a circle="+obj2.getArea());
		System.out.println("circumference of a circle="+obj2.getCircumference());
	}	
		@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		
      
		}
	
    

}
