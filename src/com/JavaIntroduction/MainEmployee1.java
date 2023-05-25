package com.JavaIntroduction;

public class MainEmployee1 {

	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1(5637,"Nithin","reddy",50000);
		
		emp1.getId();
		emp1.getFirstName();
		emp1.getLastName();
		emp1.getSalary();
		
		System.out.println(emp1.toString());
		System.out.println("Employee Further Details :");
		System.out.println("Full Name : "+emp1.getName());
		System.out.println("Annual salary : "+emp1.getAnnualSalary());
		System.out.println("Increased salary : "+emp1.raiseSalary(20));
	}

}
