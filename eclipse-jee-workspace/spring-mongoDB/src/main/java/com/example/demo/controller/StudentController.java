package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@RestController
public class StudentController {
@Autowired
private StudentRepo studentRepo;
@GetMapping("/stulist")
public List<Student> stulist(){
	return studentRepo.findAll();
}
@PostMapping("/addstu")
public void addstu(@RequestBody Student student) {
	studentRepo.save(student);
}
@DeleteMapping("/del/{id}")
public void del(@PathVariable Long id) {
	studentRepo.deleteById(id);
}
}
