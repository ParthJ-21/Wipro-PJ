package com.wipro.list;

public class Employee {
	String empId;
    String empName;
    int empAge;
    double empSalary;
	public Employee(String empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	 public int compareTo(Employee x) {
	        return Double.compare(x.empSalary, this.empSalary);
	    }
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
    
}
