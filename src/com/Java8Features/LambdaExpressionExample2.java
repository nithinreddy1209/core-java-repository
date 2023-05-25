package com.Java8Features;
import java.util.List;
import java.util.ArrayList;

interface LambdaInterface1
{
	
	
	int add(int a,int b );
}

class Lamdainfo implements LambdaInterface1
{
    int a,b;
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		this.a=a;
		this.b=b;
		
		return (this.a+this.b);
	}
	
}
public class LambdaExpressionExample2 {
	
	public static void main(String args[])
	{

		List<Integer> list=new ArrayList<>();
	
		list.add(12);
		list.add(25);
		list.add(7);
		list.add(98);
		list.add(37);
		
		System.out.println("elements:");
		list.forEach((x)->System.out.println(x));
		
		System.out.println(" even elements:");
		list.forEach((x)->{	if(x%2==0)
				               	{
									System.out.println(x);
				               	}
		                  });
		
		System.out.println(" odd elements:");
		list.forEach((x)->{	if(x%2!=0)
				               	{
									System.out.println(x);
				               	}
		                  });
		LambdaInterface1 l=(x,y)->(x+y);
		
		System.out.println("Addition : "+l.add(20, 30));
		
	}
	

}
