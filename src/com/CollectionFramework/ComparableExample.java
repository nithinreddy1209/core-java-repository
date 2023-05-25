package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Employee implements Comparable<Employee>
{

	int id;
	String name;
	
	
	
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Employee o) {
		
		if((this.name.compareTo(o.name))!= 1)
		{
			return this.name.compareTo(o.name);
		}
		else
		{
			return 0;
	    }
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"rohith");
		Employee e2=new Employee(222,"kohli");
		Employee e3=new Employee(333,"dhoni");
		Employee e4=new Employee(444,"surya");
		Employee e5=new Employee(555,"rahul");
		
		ArrayList<Employee> list=new ArrayList<>();
		//Employee emp[]=new Employee[size];  Array of employee class
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("before sorting");
		System.out.println(list);
		System.out.println("after sorting");
		Collections.sort(list);
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
