package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
 public Student getStudent() {
	 return new Student("Brundha","reddy");
 }
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("durga","yadav"));
		students.add(new Student("brundha","reddy"));
		students.add(new Student("ram","k"));
		students.add(new Student("soumya","g"));
		return students;
	}
	//PathVariables
	
	  @GetMapping("/student/pathv/{firstname}/{lastname}/") public Student
	  studentPathVariable(@PathVariable("firstname") String firstname,
	  
	  @PathVariable("lastname") String lastname ) { return new
	  Student(firstname,lastname); }
	 
	//RequestParam
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name="firstname") String firstname,
			@RequestParam(name="lastname") String lastname) {
		return new Student(firstname,lastname);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
