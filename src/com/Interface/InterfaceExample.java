package com.Interface;

interface Fruit
{
	abstract double fruitWeight();
	String fruitColor(); // based on syntax it converts the fn as abstract fn internally
}
class Apple implements Fruit
{
    double weight;
    String color;
    
    
    
	public Apple(double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	@Override
	public double fruitWeight() {
		
		return this.weight;
	}

	@Override
	public String fruitColor() {
		
		return this.color;
	}
	
}
class Mango implements Fruit
{
    double weight;
    String color;
    
    
    
	public Mango(double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	@Override
	public double fruitWeight() {
		
		return this.weight;
	}

	@Override
	public String fruitColor() {
		
		return this.color;
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		Apple a=new Apple(1.5,"red");
        System.out.println("Apple weight : "+a.fruitWeight()+"kg      "+"color : "+a.fruitColor());
        Mango m=new Mango(2.5,"yellow");
        System.out.println("Mango weight : "+m.fruitWeight()+"kg      "+"color : "+m.fruitColor());
	}

}
