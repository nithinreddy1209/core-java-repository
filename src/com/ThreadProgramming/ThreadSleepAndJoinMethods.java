package com.ThreadProgramming;

class MyThreadSleepJoin extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSleepAndJoinMethods {

	public static void main(String[] args) throws InterruptedException {
		MyThreadSleepJoin m1=new MyThreadSleepJoin ();
		MyThreadSleepJoin m2=new MyThreadSleepJoin ();
		
		m1.start();
		m1.join();
		m2.start();
		

	}

}
