package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class ServiceImpl implements EService {
	@Autowired
    public EmployeeRepo employeeRepo;
	@Override
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepo.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, Long e_id) {
		Employee employeeupdate=employeeRepo.findById(e_id).get();
		employeeupdate.setE_name(employee.getE_name());
		employeeupdate.setE_type(employee.getE_type());
		employeeRepo.save(employeeupdate);
	}

	@Override
	public void deleteEmployee(Long e_id) {
		employeeRepo.deleteById(e_id);

	}
	@Override
	public Employee getById(Long e_id) {
		return employeeRepo.findById(e_id).get();
	}

	@Override
	public void saveemp(Employee employee) {
         this.employeeRepo.save(employee);		
	}
}
