package com.Java8Features;

interface LambdaInterface
{
	
	void Multiplication(int a);
}

public class LambdaExpressionExampe1 {

	public static void main(String[] args) {
		
		LambdaInterface l=(x) -> {System.out.println(x*x);};
		
		l.Multiplication(5);
		
		
		
		

	}

	

}
