package com.Interface;
import java.util.*;
import java.io.*;
public class Exam {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try(Scanner sc=new Scanner(System.in);)
        {
            String st=null;
            int x=sc.nextInt();
            int y=sc.nextInt();
            
           
            	System.out.println(x/y);
            	System.out.println(st.length());
           
        }
        catch(NullPointerException | ArithmeticException e)
        {
            System.out.println(e);
            
        }
        
      
        
    
}   

}
