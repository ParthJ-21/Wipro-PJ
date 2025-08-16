package com.wipro.emp.service;

import java.util.List;

import com.wipro.emp.model.Employee;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Long id, Employee employee);
    void delete(Long id);
    Employee findById(Long id);
    List<Employee> searchByName(String name);
    List<Employee> getAll();
}