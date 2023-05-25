package com.Arrays;
import java.util.Scanner;
public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Size : ");
	    int N=sc.nextInt();
	    String arr[]=new String[N];
	    System.out.println("Enter Student Names : ");
	    for(int i=0;i<N;i++)
	    {
	    	arr[i]=sc.next();
	    }
	    
	    System.out.println("Students Data : ");
	    for(int i=0;i<N;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    sc.close();

	}

}
