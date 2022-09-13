package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class College {
	@Value("${id}")
	public int id;
	@Value("${name}")
	public String n;
	private Department department;
  
  
  private Student student;
  
	/*
	 * public College(Department department,Student student) {
	 * this.department=department; this.student=student; }
	 */
	public void test() {
		System.out.println("This is college id="+id+" and name is  "+n);
		department.dep();
		student.stu();
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
