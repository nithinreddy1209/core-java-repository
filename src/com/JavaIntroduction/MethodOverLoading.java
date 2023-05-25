package com.JavaIntroduction;

public class MethodOverLoading {

	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public long sum(int a,int b, int c)
	{
		return a+b+c;
	}
	
	public double sum(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		

      MethodOverLoading ob=new MethodOverLoading();
		
		System.out.println(ob.sum(58.56, 90.3));
		System.out.println(ob.sum(58, 90));
		System.out.println(ob.sum(11,23,55));
	


	}

}
