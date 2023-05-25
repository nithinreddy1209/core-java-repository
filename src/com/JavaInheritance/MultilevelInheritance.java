package com.JavaInheritance;

class Employee2
{
	private int empId;
	private String empName;
	
	public Employee2(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}
	
	public void getEmployee2()
	{
		System.out.println("employee Id : "+empId +"  "+"employeeName : "+empName);
	}
	
	
}
class Department extends Employee2
{
	private String deptId;

	public Department(int empId, String empName, String deptId) {
		super( empId,empName);
		this.deptId=deptId;
	}
	public void getDepartment2()
	{
		System.out.println("department Id : "+deptId);
	}
	
}
class Batch extends Department
{
	private long batchId;

	public Batch(int empId, String empName, String deptId, long batchId) {
		super(empId, empName, deptId);
		this.batchId = batchId;
	}
	public void getBatch()
	{
		System.out.println("Batch No : ");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Batch b=new Batch(1234,"raju","F588S34",150);
		b.getEmployee2();
		b.getDepartment2();
		b.getBatch();

	}

}
