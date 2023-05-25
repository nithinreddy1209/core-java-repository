package com.Arrays;

public class FinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arr[]= {13,78,5,37,90,22};
		final int a=30;
		int arr1[]= {90,56,3,89,56};
		arr[0]=11; //values final array elements can be re assign
		//a=20;
		
		//arr=arr1;   but we cannot change the reference of final array where for normal array be changed
		
		arr[0]=67;
		arr1[2]=66;
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}

	}

}
