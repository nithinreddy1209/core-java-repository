package com.JavaIntroduction;

public class Employee1 {
	public int id;
	public String firstName;
	public String lastName;
	public int salary;
	public String Name;
	public int annualSalary;
	
	
	Employee1(int id, String firstName, String lastName, int salary)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public String getName() {
		Name=firstName+" "+lastName;
		return Name;
	}

    public int getSalary() {
		return salary;
	}

	public int getAnnualSalary(){          
		annualSalary=salary*12;                   
		return annualSalary;
	}
	
	public int increasedSalary;
	public int percent;
	public int raiseSalary(int percent)
	{
	     this.percent=percent;
	     increasedSalary=salary+(salary*this.percent/100);
		 
		 return increasedSalary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
    

}
