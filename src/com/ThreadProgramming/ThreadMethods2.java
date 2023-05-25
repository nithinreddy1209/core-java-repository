package com.ThreadProgramming;
class MyThreadMethods2 extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(currentThread().getName()+i);
			System.out.println(currentThread().getPriority());
			
			try {
				currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadMethods2 m1=new MyThreadMethods2();
		MyThreadMethods2 m2=new MyThreadMethods2();
		
		Thread t1=new Thread(m1,"Thread 1 : ");
		Thread t2=new Thread(m2);
		t1.start();
		t1.setPriority(10);
		t2.start();
		t2.setName("Thread 2 :");
		t2.setPriority(1);
		

	}

}
