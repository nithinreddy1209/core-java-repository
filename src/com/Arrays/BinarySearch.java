package com.Arrays;

import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter key Element : ");
		int keyElement=sc.nextInt();
		
		int low=0,high=arr.length-1;
		boolean flag=false;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			
			if(keyElement==arr[mid])
			{
				flag=true;
				System.out.println("element found at "+mid+" position");
				break;
			}
			else if(keyElement>arr[mid])
			{
				low=mid+1;
			}
		
			
		    else if (keyElement< arr[mid])
			{
				high=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found...");
		} 

	}

}
