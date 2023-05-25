package com.CollectionFramework;
import java.util.*;
public class Examplec3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       

	       Scanner sc=new Scanner(System.in);
	       
	        System.out.println("enter lines");
	        int n=sc.nextInt();
	        ArrayList<Integer>[] list=new ArrayList[n];
	        
	        int d,i,j,k;
	        for(k=0;k<n;k++) //Remember array always starts with 0
	        {
	            list[k]=new ArrayList<Integer>();
	        }
	        System.out.println("enter elements");
	        for( i=0;i<n;i++)
	        {
	            j=0;
	            do
	            {
	                list[i].add(j,sc.nextInt());
	                j=j+1;
	            }while(j<=list[i].get(0));
	        }
        
         for(int l=0;l<n;l++)
         {
        	 System.out.println(list[l]);
         }

        
        
	}

}
