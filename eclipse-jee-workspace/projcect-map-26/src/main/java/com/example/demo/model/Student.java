package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;

@Entity
@Table
public class Student {
	@Id
    private Long id;
    private String name;
    private String rollnumber;
    private String mailid;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_id")
    private Classname classname;
	public Classname getClassname() {
		return classname;
	}
	public void setClassname(Classname classname) {
		this.classname = classname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(Long id, String name, String rollnumber, String mailid) {
		super();
		this.id = id;
		this.name = name;
		this.rollnumber = rollnumber;
		this.mailid = mailid;
	}
	public Student() {
		super();
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
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}    
}
