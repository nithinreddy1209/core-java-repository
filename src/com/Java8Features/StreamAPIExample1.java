package com.Java8Features;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPIExample1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		List<Integer> list=new ArrayList<>(Arrays.asList(12,28,3,77,98,53));

		System.out.println(list);
		
		System.out.println("Modified List : ");
		
		//map() method : Intermediate method
		List modifiedList=list.stream()
				          .map((x)->(x*x))
				          .collect(Collectors.toList());//return result
		
		//stream() : a sequential stream over elements in this collections
		/*map() : It is an Intermediate method which returns  a stream consisting of the 
		  results of applying the given function to the elements of this stream.
	    */
		/*
		 It is a terminal method which collect method is used to return the result of the
		  intermediate operations that are performed  on the stream. 
		 */
		
		System.out.println(modifiedList);
		System.out.println("Odd List :");
		
		//filter() method : Intermediate method used to filter elements
		
		//collect() method : terminal method used to collect elements from the list
		List oddList=list.stream()
		          .filter((x)->(x%2!=0))
		          .collect(Collectors.toList());//return List
		System.out.println(oddList);
		
		System.out.println("Even elements :");
		List evenList=list.stream()
		          .filter((x)->(x%2==0))
		          .collect(Collectors.toList());// return List
		System.out.println(evenList);
        System.out.println("Sorted elements :"); 
        
        //sorted() method : Intermediate method used to sort elements
        System.out.println(" Odd elements :");
		List sortedList=list.stream()
		          .sorted()
		          .collect(Collectors.toList());//return List
		System.out.println(sortedList);
		
		//foreach() method : terminal method
		
		System.out.println("Incremented elements :");
		
		list.stream()
		.map((y)-> (y+1))
		.forEach((x)-> System.out.println(x));//print result
		
		System.out.println("Reduced list : ");
		int reducedValue =list.stream()
		.filter((y)-> (y%2==0))
		.reduce(0,(answer,i)->(answer+i));// return int
		
		System.out.println(reducedValue);
		
		Integer x =list.stream()
				        .max(Integer::compare)
				        .get();
		
		System.out.println("Max Element : "+x);
		Integer x1 =list.stream()
		        .min(Integer::compare)
		        .get();

        System.out.println("Max Element : "+x1);
		
	}
	
}
