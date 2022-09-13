package springboot.service.impl;

import org.springframework.stereotype.Service;

import springboot.model.Employee;
import springboot.repository.EmployeeRepository;
import springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.setEmployeeRepository(employeeRepository);
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employee;
	}
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

}
