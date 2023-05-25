package com.CollectionFramework;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public  class Examplec {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stu
	
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		
		System.out.println("enter size");
		int N=sc.nextInt();
		
		
		String[] strarr=new String[N];
		
		System.out.println("enter string");
		
		for(int i=0;i<N;i++)
		{
			strarr[i]=sc.next();
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(strarr[i]+" ");
		}
		System.out.println();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(strarr[i]);
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<N;i++)
		{
			list.add(i,arr[i]);
		}
		System.out.println(list);

	}

}
