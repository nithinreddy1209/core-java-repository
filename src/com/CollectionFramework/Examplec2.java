package com.CollectionFramework;
import java.util.*;
import java.io.*;
public class Examplec2 {

	public static void main(String[] args)
	{
		LinkedHashSet<String> set= new LinkedHashSet<>();
		LinkedHashSet<String> set1= new LinkedHashSet<>();
		set.add("a");
		set.add("b");
		
		set1.add("c");
		set1.add("d");
		
		set.addAll(set1);
		
		System.out.println(set);
	}

}