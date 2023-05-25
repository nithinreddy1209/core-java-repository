package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
class Employee1 implements Comparable<Employee1>
{

	int id;
	String name;
	
	
	
	public Employee1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Employee1 o) {
		
		if(this.id>o.id)
		{
			return this.id-o.id;
		}
		else if(this.id<o.id)
		{
			return this.id-o.id;
		}
		else
		{
			return 0;
	    }
	}
}

public class Comparable2 {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(333,"rohith");
		Employee1 e2=new Employee1(111,"kohli");
		Employee1 e3=new Employee1(555,"dhoni");
		Employee1 e4=new Employee1(222,"surya");
		Employee1 e5=new Employee1(444,"rahul");
		
		//ArrayList<Employee> list=new ArrayList<>();  arraylist of employee
		Employee1 emp[]=new Employee1[5];  
		
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		
		
		System.out.println("before sorting");
		for(int i=0;i<5;i++)
		{
			System.out.println(emp[i]);
		}
		System.out.println("after sorting");
		Arrays.sort(emp);
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(emp[i]);
		}
		

	}

}
