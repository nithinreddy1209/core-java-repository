package com.JavaInheritance;

class Sample
{
	void getMethod1()
	{
		System.out.println("parent class overridden method...");
	}
}
class Normal extends Sample
{
	void getNormal()
	{
		System.out.println("Child class Normal method...");
	}
	@Override
	void getMethod1()
	{
		super.getMethod1();
		System.out.println("child class overriding method...");
	}
}
public class SuperOverride {

	public static void main(String[] args) {
		Normal n=new Normal();
		n.getMethod1();
		n.getNormal();
		

	}

}
