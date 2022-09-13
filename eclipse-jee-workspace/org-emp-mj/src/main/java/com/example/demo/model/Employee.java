package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private Long id;
private String name;
private String type;
private Long o_id;
public Employee() {
	super();
}
public Long getO_id() {
	return o_id;
}
public void setO_id(Long o_id) {
	this.o_id = o_id;
}
public Employee(Long id, String name, String type, Long o_id) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.o_id = o_id;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
