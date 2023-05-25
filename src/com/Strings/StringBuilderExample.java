package com.Strings;
import org.openjdk.jol.vm.VM;
public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st=new StringBuilder(); 
		StringBuilder st1=new StringBuilder(50);
		StringBuilder st2=new StringBuilder("Hello World");
		
		
		st.ensureCapacity(100);
		
		//append
				st.append("Welcome to ");
				
			
				
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
				StringBuilder s1=new StringBuilder("hello ");
				System.out.println(s1.insert(6,"world"));
		
	}

}
