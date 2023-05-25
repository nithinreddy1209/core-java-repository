package com.Strings;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isEmpty() - returns true if the specified string object contains no value or only whitespace characters otherwise false.
		  //isBlank() -	returns true if the length of the string is 0 otherwise false.
	       
			String st1,st2;
			st1=" ";
			
			System.out.println(st1.isBlank());//does not contain any value 
			System.out.println(st1.isEmpty());//because length is zero
			
			
			//trim : removes extra spaces from the leading and trailing position of the given string
			
			String name="  Raman Shah   ";
			
			System.out.println(name);
			System.out.println(name.trim());//extra spaces will removed
			
			//replace : It replace
			String username="Raman Shah";
			String para="It is a tall building. It is build in 1990.";
			System.out.println(username.replace("Shah","Roy"));
			
			
			//replace all
			System.out.println(para);
			System.out.println(para.replaceAll("is", "was"));
			
			
			//split
			String array[]=para.split(" ");
			String array1[]=para.split("a");
			System.out.println("Split 1------------ ");
			
			for(String element:array)
			{
				System.out.println(element);
			}
			System.out.println("Split 2------------ ");
			for(int i=0;i<array1.length;i++)
			{
				System.out.println(array1[i]);
			}

	}

}
