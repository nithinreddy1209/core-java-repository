package com.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][];
		
		arr[0]=new int[3];//first row will have three elements 
        arr[1]=new int[2];//second row will have three elements 
        arr[2]=new int[4];//second row will have four elements
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		
        		arr[i][j]=++count;
        	}
        	
        }
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		
        		System.out.print(arr[i][j]+"   ");
        	}
        	System.out.println(" ");
        	
        }
        
	}

}
