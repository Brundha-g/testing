package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Organisation;
import com.example.demo.repo.EmpRepo;
import com.example.demo.repo.OrgRepo;

@RestController
public class EmployeeController {
	@Autowired
	EmpRepo empRepo;
	@Autowired
    OrgRepo orgRepo;
@GetMapping("/orglist")
public List<Organisation> orglist(){
	return orgRepo.findAll();
}
@GetMapping("/emplist")
public List<Employee> emplist(){
	return empRepo.findAll();
}
@GetMapping("/empbyorg/{o_id}")
public List<Employee> empbyorg(@PathVariable Long o_id){
	List<Employee> e=new ArrayList<Employee>();
	for(Employee x:empRepo.findAll()) {
		if(x.getO_id()==o_id) {
			e.add(x);
		}
	}
	return e;
}
@PostMapping("/orgsave")
public void save(@RequestBody Organisation organisation) {
	orgRepo.save(organisation);
}
@PostMapping("/empsave")
public void saveemp(@RequestBody Employee employee) {
	empRepo.save(employee);
}
@DeleteMapping("/orgdel")
public void del(@PathVariable Long o_id) {
	orgRepo.deleteById(o_id);
}
@DeleteMapping("/empdel")
public void delemp(@PathVariable Long id) {
	empRepo.deleteById(id);
}
}
