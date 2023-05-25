package com.Strings;

import org.openjdk.jol.vm.VM;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//st is mutable
		
				StringBuffer st=new StringBuffer("Java programming");
				
				
				StringBuffer st1=new StringBuffer("Java programming");
				
				
				System.out.println(VM.current().addressOf(st));
				System.out.println(VM.current().addressOf(st1));
				
				//append
				st.append("Welcome to ");
				
				System.out.println(VM.current().addressOf(st));
				
				//reverse
				System.out.println(st.reverse());
				
				
				StringBuffer s=new StringBuffer("welcome to Java programming");
				
				//replace
				System.out.println(s.replace(11, 15, "c"));
				
				//delete
				System.out.println(s.delete(16, 27));
				
				
				//capacity
				System.out.println(s.capacity());
				
				
				//insert
				StringBuffer s1=new StringBuffer("hello ");
				System.out.println(s1.insert(6,"world"));

	}

}
