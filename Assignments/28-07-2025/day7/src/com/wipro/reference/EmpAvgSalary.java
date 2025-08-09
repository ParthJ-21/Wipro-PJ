package com.wipro.reference;

import java.util.Arrays;
import java.util.List;

public class EmpAvgSalary {
	 public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	                new Employee("Ram", 21, 43400),
	                new Employee("Ali", 15, 12340),
	                new Employee("Sham", 10, 20000),
	                new Employee("Parth", 23, 30000),
	                new Employee("Raju", 38, 55000)
	        );

	        double averageSalary = employees.stream()
	                .filter(emp -> emp.getAge() > 30 && emp.getSalary() > 50000)
	                .mapToDouble(Employee::getSalary)
	                .average()
	                .orElse(0.0); 

	        System.out.println("Average salary of employees  " + averageSalary);
	    }
	
}
