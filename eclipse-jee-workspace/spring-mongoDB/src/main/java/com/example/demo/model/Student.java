package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
@Id
private Long id;
private String name;
private String dep;
public Student() {
	super();
}
public Student(Long id, String name, String dep) {
	super();
	this.id = id;
	this.name = name;
	this.dep = dep;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
}
