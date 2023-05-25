package com.ThreadProgramming;

class MyThreadMethods extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(currentThread().getName()+i);
			System.out.println("id : "+currentThread().getId());
			
			try {
				currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadMethods {

	public static void main(String[] args) {
		
		MyThreadMethods m1=new MyThreadMethods();
		MyThreadMethods m2=new MyThreadMethods();
		
		Thread t1=new Thread(m1,"Thread 1 : ");
		Thread t2=new Thread(m2);
		t1.start();
		
		t2.start();
		t2.setName("Thread 2 :");

	}

}
