package com.ThreadProgramming;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("This is thread programming");
	}
}

public class ThreadIntroduction {

	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.start();

	}

}
