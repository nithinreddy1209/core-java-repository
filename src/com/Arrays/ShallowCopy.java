package com.Arrays;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ar[]= {11,22,33,44,55,66,77,88,99,111};
		
		int ar1[]=ar.clone(); //copying an array to another-shallow copy
		
		ar[5]=0;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
			
		}

	}

}
