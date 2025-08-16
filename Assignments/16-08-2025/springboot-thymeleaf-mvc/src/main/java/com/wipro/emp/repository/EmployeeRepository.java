package com.wipro.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.emp.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByNameContainingIgnoreCase(String name);
}