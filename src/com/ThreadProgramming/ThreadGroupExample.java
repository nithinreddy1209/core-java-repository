package com.ThreadProgramming;

class DemoThread extends Thread
{
	String threadName;
	public DemoThread(String threadName, ThreadGroup tg)
	{	
		super(tg,threadName);
		this.threadName=threadName;
		start();
		/*try {
			join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class ThreadGroupExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg=new ThreadGroup("parent threadgroup");
		DemoThread d1=new DemoThread("Thread1 ",tg);
		DemoThread d2=new DemoThread("Thread2 ",tg);
		DemoThread d3=new DemoThread("Thread3 ",tg);
		
		System.out.println(tg.activeCount());

	}

}
