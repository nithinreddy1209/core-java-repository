package com.Strings;
import java.util.Scanner;
public class StringsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s=scan.nextLine();
		int alphabet=0,vowels=0,consonants=0,lowerCase=0,upperCase=0,spaces=0,digits=0,special=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				digits=digits++;
			}
			
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowerCase++;
				if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					vowels=vowels++;
				}
				else
				{
					consonants=consonants++;
				}
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				upperCase++;
				if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					vowels=vowels++;
				}
				else
				{
					consonants=consonants++;
				}
			}
			
			else if(s.charAt(i)==' ')
			{
				spaces=spaces++;
			}
			else
			{
				special=special++;
				
			}
			
		}
		
		
		System.out.println("Alphabets="+(lowerCase+upperCase));
		System.out.println("lowerCase alphabets="+lowerCase);
		System.out.println("UpperCase alphabets="+upperCase);	
		System.out.println("Vowels="+vowels);
		System.out.println("Consonants="+consonants);
		System.out.println("Spaces="+spaces);
		System.out.println("Words="+(spaces+1));
		System.out.println("Digits="+digits);
		System.out.println("Special="+special);

	}

}
