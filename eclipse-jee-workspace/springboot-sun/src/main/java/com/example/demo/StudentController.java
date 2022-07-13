package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/student")
public Student getStudent() {
	return new Student("durga","yadav");
}
@GetMapping("/students")
public List<Student> getStudents() {
	List<Student> students=new ArrayList<>();
	students.add(new Student("durga","yadav"));
	students.add(new Student("brundha","reddy"));
	students.add(new Student("ramya","k"));
	students.add(new Student("soumya","g"));
    return students;
}


  @GetMapping("/studentpv/{firstname}/{lastname}") public Student
  studentPathVariable(@PathVariable String firstname,
  
  @PathVariable("lastname") String lastname1) { return new
  Student(firstname,lastname1);
  } 
@GetMapping("/student/rp")
public Student studentRequestParam(@RequestParam(name="firstname") String firstname,
		@RequestParam(name="lastname") String lastname) {
	return new Student(firstname,lastname);
}
}