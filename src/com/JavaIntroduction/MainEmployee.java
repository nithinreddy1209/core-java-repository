package com.JavaIntroduction;

public class MainEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeId(7580);
		emp.setEmployeeName("Mr. Raman");
		emp.setEmployeeEmail("raman@gmail.com");
		emp.setEmployeePhone(93993838);
		emp.setEmployeeSalary(70000);
		
		Employee emp1=new Employee(363637,"Mr. Kumar",50000,"kumar@gmail.com",83839393);
		
		emp.displayEmployeeDetails();
		emp1.displayEmployeeDetails();
		
		
		emp.salaryCheck();
		emp1.salaryCheck();
		
		System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmployeeSalary());

	}

}
