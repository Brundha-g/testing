package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface Employeeservices {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeByid(Long id);
	void deleteEmployeeById(long id);
}
