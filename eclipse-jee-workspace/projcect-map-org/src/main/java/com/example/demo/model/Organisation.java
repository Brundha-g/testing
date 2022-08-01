package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Organisation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column
	private String name;
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn
	 */
	  @ManyToMany(cascade = CascadeType.ALL)
	  public List<Employee> employee;
	  public List<Employee> getEmployee() { 
		  return employee; 
		  } 
	  public void setEmployee(List<Employee> employee) { 
		  this.employee = employee;
		  }
	public Organisation() {
	}
	public Organisation(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
