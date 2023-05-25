package com.Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		
        int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter key Element : ");
		int keyElement=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(keyElement==arr[i])
			{
				flag=false;
				System.out.println("Element Found...");
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Element not Found...");
		}

	}

}
