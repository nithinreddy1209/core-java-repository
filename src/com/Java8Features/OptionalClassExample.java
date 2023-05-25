package com.Java8Features;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		String str1="Java";
		String str2=null;
		
		Optional<String> optional1=Optional.of(str1);
		Optional<String> optional2=Optional.ofNullable(str2);
		
		System.out.println(optional1);
		System.out.println(optional2);
		
		if(optional1.isPresent())
		{
			System.out.println("string 1 :"+optional1.get());
		}
		else
		{
			System.out.println("string 1 : No value present.");
		}
		if(optional2.isPresent())
		{
			System.out.println("string 2 :"+optional1.get());
		}
		else
		{
			System.out.println("string 2 : No value present.");
		}
		
		System.out.println(optional1.isPresent());
		System.out.println(optional2.isPresent());
		System.out.println(optional1.isEmpty());
		System.out.println(optional2.isEmpty());
		
		optional1.ifPresentOrElse(x->System.out.println(x),()->System.out.println("Value not present"));
		optional2.ifPresentOrElse(x->System.out.println(x),()->System.out.println("Value not present"));

		String a=null;
		String b="programming";
		
		String name=Optional.ofNullable(a).orElse(b);
		System.out.println(name);
		
		System.out.println(Optional.ofNullable(a).orElseGet(()->"hello world"));
		
		//System.out.println(Optional.ofNullable(a).orElseThrow());
		//throw default exception : NoSuchException
		System.out.println(Optional.ofNullable(a).orElseThrow(IllegalArgumentException::new));
		//throw mentioned exception
	}

}
