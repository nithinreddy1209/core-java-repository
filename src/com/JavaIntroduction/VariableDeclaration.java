package com.JavaIntroduction;

public class VariableDeclaration {

	public static void main(String[] args) {
		//primitive data types
				int otp=6543,orderId,Int;
				int mobileNo=986543210;
				orderId=995463;
				System.out.println("otp : "+otp+"   mobileNo : "+mobileNo+"   orderId : "+orderId);
				Int=2147483647;
				System.out.println("Int : "+Int);
				byte Byte=127;
				System.out.println("Byte : "+Byte);
				short Short= 32767;
				System.out.println("short : "+Short);
				long Long=9223372036854775807L;  // long should declare with 'L' at end of the value
				System.out.println("long : "+Long);
				char alphabet= 'N';
				System.out.println("char : "+alphabet);
				float Float = 9.333333333333333333333333333F;//It take only six Digits after decimal & 'F'
				System.out.println("Float : "+Float);
				double Double = 8.44444444444444455555d;// It takes only 15 digits $ 'd' is optional
				System.out.println("double : "+Double);
				boolean Value =true; // it accepts only values true or false , default is false
				System.out.println("Boolean1 : "+Value);
				// Non primitive or User definesd data types
				
				int array[]=new int[5];
				array[0]=1;
				array[1]=2;
				array[2]=3;
				array[3]=4;
				array[4]=5;
				System.out.println("array third element : "+array[2]);
				int array1[]= {1,2,3,4,5};
				System.out.println("array1 second element : "+array1[1]);
				
				String first= "Java";
				System.out.println("string1 : "+first);
				String second = new String("Hello world");
				System.out.println("string2 : "+second);
				first="java programming";
				System.out.println("modified string1 : "+first);

	}

}
