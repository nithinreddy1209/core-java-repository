package com.CollectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class EmployeeInfo 
{
	int id;
	int salary;
	String name;
	public EmployeeInfo(int id, String name, int salary) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}

class SalaryComparator implements Comparator<EmployeeInfo>
{

	@Override
	public int compare(EmployeeInfo o1,EmployeeInfo o2) {
		if(o1.salary ==o2.salary)
		{
			return 0;
		}
		else if(o1.salary>o2.salary)
		{
			return o1.salary-o2.salary;
		}
		else
		{
		return o1.salary-o2.salary;
	    }
	}	
	
}

class NameComparator implements Comparator<EmployeeInfo>
{

	@Override
	public int compare(EmployeeInfo o1,EmployeeInfo o2) {
		if(o1.name.compareTo(o2.name)!=1)
		{
			return o1.name.compareTo(o2.name);
		}
		
		else
		{
		return 0;
	    }
	}	
	
}

public class CompatorExample {

	public static void main(String[] args) {
		
		EmployeeInfo emp1=new EmployeeInfo(111,"rohith",50000);
		EmployeeInfo emp2=new EmployeeInfo(222,"kohli",100000);
		EmployeeInfo emp3=new EmployeeInfo(333,"dhoni",75000);
		EmployeeInfo emp4=new EmployeeInfo(444,"surya",25000);
		EmployeeInfo emp5=new EmployeeInfo(555,"rahul",30000);
		
		SalaryComparator sc=new SalaryComparator();
		
		ArrayList<EmployeeInfo> l=new ArrayList<>();
		
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		l.add(emp4);
		l.add(emp5);
		
		System.out.println("before sorting based on salary");
		System.out.println();
		
		Iterator<EmployeeInfo> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collections.sort(l,sc);
		System.out.println();
		System.out.println("after sorting based on salary");
		System.out.println();
		Iterator<EmployeeInfo> itr1=l.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		NameComparator nc=new NameComparator();
		System.out.println();
        System.out.println("before sorting based on names");
		System.out.println();
		Iterator<EmployeeInfo> itr2=l.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		Collections.sort(l,nc);
		System.out.println();
		System.out.println("after sorting based on names");
		System.out.println();
		Iterator<EmployeeInfo> itr3=l.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
	}

}
