package com.wipro.emp.service.impl;

import org.springframework.stereotype.Service;

import com.wipro.emp.model.Employee;
import com.wipro.emp.repository.EmployeeRepository;
import com.wipro.emp.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee update(Long id, Employee employee) {
        Employee existing = repo.findById(id).orElseThrow();
        existing.setName(employee.getName());
        existing.setType(employee.getType());
        existing.setAddress(employee.getAddress());
        existing.setDepartment(employee.getDepartment());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Employee findById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }
}