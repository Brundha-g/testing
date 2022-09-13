package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String empname;
	 private String empmail;
	 private String empdomain;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	public String getEmpdomain() {
		return empdomain;
	}
	public void setEmpdomain(String empdomain) {
		this.empdomain = empdomain;
	}
	public Employee() {
		
	}
	public Employee(Long id, String empname, String empmail, String empdomain) {
		super();
		this.id = id;
		this.empname = empname;
		this.empmail = empmail;
		this.empdomain = empdomain;
	}

	
}
