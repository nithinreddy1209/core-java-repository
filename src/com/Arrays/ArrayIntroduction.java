package com.Arrays;
import java.io.*;
public class ArrayIntroduction {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//dynamic declaration
		System.out.println("Enter Array Size : ");
		int N=Integer.parseInt(br.readLine());
		
		int arr[]=new int[N];
		
		//dynamic initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//dynamic display
		System.out.println("Dynamic Array elements : ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+"  ");
			
		}
		
		//static declaration and initialization
		
		int arr1[]= {1,2,3,4,5};
		
		//static display
		System.out.println();
		System.out.println("Static Array elements : ");
		for(int i=0;i<arr1.length;i++)
		{
			
			System.out.print(arr1[i]+"  ");
			
		}
		
		
	}

}
