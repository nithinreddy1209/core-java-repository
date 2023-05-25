package com.JavaIntroduction;

public class CopyConstructor {

	//Camelcase
		//Data members/variables, properties, instance varables
		private long employeeId;
		private String employeeName;
		private double employeeSalary;
		private String employeeEmail;
		private long employeePhone;
		
		
		//default constructor
		public CopyConstructor()
		{
			System.out.println("default constructor invoked");
		}
		
		//parameterized constructor
		public CopyConstructor(long employeeId,String employeeName,double employeeSalary, String employeeEmail, long employeePhone)
		{
			//this refers to current class object
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.employeePhone=employeePhone;
			this.employeeSalary=employeeSalary;
			this.employeeEmail=employeeEmail;
		}
		
		public CopyConstructor(CopyConstructor emp)
		{
			this.employeeId=emp.employeeId;
			this.employeeName=emp.employeeName;
			this.employeePhone=emp.employeePhone;
			this.employeeSalary=emp.employeeSalary;
			this.employeeEmail=emp.employeeEmail;
			
		}
		
		
		
		public long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getEmployeeSalary() {
			return employeeSalary;
		}

		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}

		public String getEmployeeEmail() {
			return employeeEmail;
		}

		public void setEmployeeEmail(String employeeEmail) {
			this.employeeEmail = employeeEmail;
		}

		public long getEmployeePhone() {
			return employeePhone;
		}

		public void setEmployeePhone(long employeePhone) {
			this.employeePhone = employeePhone;
		}

		public CopyConstructor(long employeeId, String employeeName, double employeeSalary) {
			
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}

		void salaryCheck()
		{
			System.out.println(this.employeeSalary*12);
			
		}
		
		void displayEmployeeDetails()
		{
			System.out.println(this.employeeId + " "+this.employeeName+" "+this.employeeSalary+" "+this.employeePhone+" "+this.employeeEmail);
			
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", employeeEmail=" + employeeEmail + ", employeePhone=" + employeePhone + "]";
		}

	

}
