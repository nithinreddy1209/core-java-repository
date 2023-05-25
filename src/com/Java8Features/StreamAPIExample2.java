package com.Java8Features;

import java.util.Arrays;
import java.util.List;
public class StreamAPIExample2 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		list.stream()
				.map((y)-> (y*y*y))
				.forEach((x)-> System.out.println(x));

	}

}
