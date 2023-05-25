package com.ThreadProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MythreadPool implements Runnable
{
	String name;
	

	public MythreadPool(String name) {
		
		this.name = name;
	}

    @Override
	public void run() {
		
		for(int i=1;i<=50;i++)
		{
			System.out.println(name+" "+i);
			
		}
		
	}
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		MythreadPool t1=new MythreadPool(" Request1 :");
		MythreadPool t2=new MythreadPool(" Request2 :");
		MythreadPool t3=new MythreadPool(" Request3 :");
		MythreadPool t4=new MythreadPool(" Request4 :");
		MythreadPool t5=new MythreadPool(" Request5 :");
		
		//creates a thread pool of 3 threads
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		//request assigned to the available thread in Thread pool
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);

	}

}
