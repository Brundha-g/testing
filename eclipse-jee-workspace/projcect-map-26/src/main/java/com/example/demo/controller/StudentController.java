package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Classname;
import com.example.demo.model.Student;
import com.example.demo.repository.ClassRepo;
import com.example.demo.repository.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	private ClassRepo classrepo;
	@Autowired
	private StudentRepo sturepo;
	
	@GetMapping("/class")
	public List<Classname> getallclass(){
		return classrepo.findAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		this.sturepo.save(student);
	}

}
