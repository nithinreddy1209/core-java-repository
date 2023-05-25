package com.JavaIntroduction;

public class JumpStatements {

	public static void main(String[] args) {
		
		int i,n;
        
		for(i=1,n=100;i<=n;i++)
		{
			
			if(i==25)
			{
				continue;
			}
			System.out.println(i);
			if(i==50)
			{
				break;
			}
			
		}
		
	}

}
