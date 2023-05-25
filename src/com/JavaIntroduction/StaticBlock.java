package com.JavaIntroduction;

public class StaticBlock {

	public static int rollNo;
	public int id;
	
	public void exam()
	{
		System.out.println("This is normal method");
	}
	static
	{
		//id=1234;
		rollNo=18;
		System.out.println("roll no : "+rollNo);
		
	/*	public static void exam() // only static variables and statements are accepted
		{
			System.out.println("");
		}
		*/
	}
	
	
	public static void main(String[] args) {
		
		
		StaticBlock st=new StaticBlock();
		st.exam();
		

	}

}
