package com.Interface;

public class WrapperUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long len=new Long(25362);
		
		long l=len.longValue();
		
		System.out.println("Long obj value : "+len);
		System.out.println("Long obj to long data value : "+l);
		
		int i=len.intValue();//we can un box Long obj to int data
		System.out.println("Long obj to int data value : "+i);
		
		Integer in=new Integer(25);
		long lo=in.longValue();
		System.out.println("Integer obj to long data value : "+i);
	}

}
