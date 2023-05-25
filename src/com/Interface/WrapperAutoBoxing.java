package com.Interface;

public class WrapperAutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long length=23891389;
		
		Long len=Long.valueOf(length);//explicit autoboxing by jvm
		
		Long lengt=length;//implicit autoboxing by user
		
		System.out.println("long primitive data value : "+length);
		System.out.println("converted long to Long object value : "+len);
		System.out.println(lengt);
		
		int in=345;
		
		Long lo=Long.valueOf(in);//int to Long is acceptable(low to high)
		
		System.out.println("int primitive data value : "+in);
		System.out.println("converted int to Long object value : "+lo);
		
		long ab=635363;
		
		//Integer i=Integer.valueOf(ab);  //  long to Integer conversion is not acceptable(high to low)
		//String str="frwhw38628";
		//Long le=Long.valueOf(str);//occurs run time error
		//System.out.println("converted string to Long object value : "+lo);
		String str1="536367";
		Long ln=Long.valueOf(str1);
		System.out.println("converted string to Long object value : "+ln);
	}

}
