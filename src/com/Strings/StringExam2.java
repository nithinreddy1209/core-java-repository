package com.Strings;
import java.util.Scanner;
class Amstersam
{
	String str1;
	public int countAm(String str)
	{
		int count=0;
		str1=str;
		String arr[]=str1.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase("am"))
			{
				count=count+1;
			}
		}
		
		return count;
	}
}

public class StringExam2 {

	public static void main(String[] args) {
		
		Amstersam am=new Amstersam();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println(am.countAm(str));

	}

}
