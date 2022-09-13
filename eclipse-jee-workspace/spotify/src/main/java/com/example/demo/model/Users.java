package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
@Id
private String u_name;
private String u_id;
public Users() {
}
public Users(String u_name, String u_id) {
	super();
	this.u_name = u_name;
	this.u_id= u_id;
}
public String getU_name() {
	return u_name;
}
public void setU_name(String u_name) {
	this.u_name = u_name;
}
public String getU_id() {
	return u_id;
}
public void setU_id(String u_id) {
	this.u_id= u_id;
}
}
