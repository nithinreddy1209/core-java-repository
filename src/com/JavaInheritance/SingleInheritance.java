package com.JavaInheritance;

class Employee
{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getEmployee()
	{
		System.out.println("employee Id : "+empId +"  "+"employeeName : "+empName);
	}
	
	
}
class Developer extends Employee
{
	private String deptId;

	public Developer(int empId, String empName, String deptId) {
		super(empId, empName);
		this.deptId = deptId;
	}
	public void getDepartment()
	{
		System.out.println("department Id : "+deptId);
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Developer d= new Developer(6462,"Nithin","G628839h");
		d.getEmployee();
		d.getDepartment();

	}

}
