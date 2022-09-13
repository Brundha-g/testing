package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employeerepository;

@Service
public class EmployeeServicesImple implements Employeeservices {
	@Autowired
	private Employeerepository employeerepository;
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeerepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		this.employeerepository.save(employee);

	}

	@Override
	public Employee getEmployeeByid(Long id) {
		Optional < Employee > optional = employeerepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } 
        else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeerepository.deleteById(id);

	}

}
