package com.JavaIntroduction;

public class MainCopyConstructor {

	public static void main(String[] args) {
		CopyConstructor emp=new CopyConstructor();
		emp.setEmployeeId(7580);
		emp.setEmployeeName("Mr. Raman");
		emp.setEmployeeEmail("raman@gmail.com");
		emp.setEmployeePhone(93993838);
		emp.setEmployeeSalary(70000);
		
		CopyConstructor emp1=new CopyConstructor(363637,"Mr. Kumar",50000,"kumar@gmail.com",83839393);
		
		emp.displayEmployeeDetails();
		emp1.displayEmployeeDetails();
		
		
		emp.salaryCheck();
		emp1.salaryCheck();
		
		System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmployeeSalary());
		System.out.println("Copy Constructor Values : ");
		CopyConstructor emp3=new CopyConstructor(emp);
		emp3.displayEmployeeDetails();

	}

}
