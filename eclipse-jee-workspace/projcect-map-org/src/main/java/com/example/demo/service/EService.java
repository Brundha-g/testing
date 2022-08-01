package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EService {
	List<Employee> getEmployee();
	void saveEmployee(Employee employee);
	void deleteEmployee(Long e_id);
	void updateEmployee(Employee employee, Long e_id);
	Employee getById(Long e_id);
	void saveemp(Employee employee);
	
}
