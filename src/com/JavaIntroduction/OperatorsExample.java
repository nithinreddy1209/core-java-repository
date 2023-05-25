package com.JavaIntroduction;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20;
		// ternary operatot
		int result=(a<b)?a:b;
		
		System.out.println(result);
		
		// arthematic operator
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b%a);
		
		//relation operator
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//logical operator
		System.out.println((a!=b)&&(a>b));
		System.out.println((a!=b)||(a>b));
		
		//bitwise shift operator
		System.out.println(a>>2);
		System.out.println(b<<2);
		
		//assignment operator
		a=a+10;
		a+=10;
		System.out.println(a);
		
		

	}

}
