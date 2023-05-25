package com.Arrays;

public class SumAndReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array : "+sum);
		
		System.out.println("reverse of array : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"   ");
		}
	}

}
