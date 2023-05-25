package com.JavaInheritance;

class Employee1
{
	private int empId;
	private String empName;
	
	public Employee1(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getEmployee1()
	{
		System.out.println("employee Id : "+empId +"  "+"employeeName : "+empName);
	}
	
	
}
class Developer1 extends Employee1
{
	private String deptId;

	public Developer1(int empId, String empName, String deptId) {
		super(empId, empName);
		this.deptId = deptId;
	}
	public void getDepartment1()
	{
		System.out.println("department Id : "+deptId);
	}
	
}
class Developer2 extends Employee1
{
	private String deptId;

	public Developer2(int empId, String empName, String deptId) {
		super(empId, empName);
		this.deptId = deptId;
	}
	public void getDepartment2()
	{
		System.out.println("department Id : "+deptId);
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer1 d1= new Developer1(7826,"ram","G628839h");
		d1.getEmployee1();
		d1.getDepartment1();
		System.out.println("  ");
		Developer2 d2= new Developer2(5788,"raj","h7889qjg");
		d2.getEmployee1();
		d2.getDepartment2();

	}

}
