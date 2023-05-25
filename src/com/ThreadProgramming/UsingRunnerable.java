package com.ThreadProgramming;

class Sample1  implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
	
}

class Sample2  implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
	
}
public class UsingRunnerable {

	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Thread t1=new Thread(s1);
		t1.start();
		Sample2 s2=new Sample2();
		Thread t2=new Thread(s2);
		t2.start();

	}

}
