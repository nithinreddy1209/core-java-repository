package com.Arrays;
import java.util.Scanner;
public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter number of cols : ");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter row "+(i+1)+" column "+(j+1)+" value : ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+"       ");
				
			}
			System.out.println("  ");
			System.out.println("  ");
		}
	}

}
