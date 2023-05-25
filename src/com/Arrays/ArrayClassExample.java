package com.Arrays;

import java.util.Arrays;

public class ArrayClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {30,20,50,10,90,40,70};
		int arr1[]= {30,20,50,10,90,40,70};
		
		//compare
		System.out.println("compare : "+Arrays.compare(arr, arr1));
		
		/*
		 * if two arrays are equal it return 0, else 1.
		 */
		
		//sorting
		System.out.println("sorting : ");
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
	    {
	         System.out.print(arr[i]+"   ");
	    }  
	    System.out.println();
	    
	    //searching
	    System.out.println("searching :"+Arrays.binarySearch(arr, 40));
	    /*
	     * if element found it returns the index of element else it return negative value
	     */
	}

}
