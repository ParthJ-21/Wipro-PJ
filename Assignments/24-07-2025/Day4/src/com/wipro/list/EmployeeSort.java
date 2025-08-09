package com.wipro.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E101", "Alice", 30, 55000));
        employees.add(new Employee("E102", "Bob", 28, 70000));
        employees.add(new Employee("E103", "Charlie", 35, 65000));
        employees.add(new Employee("E104", "Diana", 26, 72000));

        System.out.println("Sorted salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
	}

}
