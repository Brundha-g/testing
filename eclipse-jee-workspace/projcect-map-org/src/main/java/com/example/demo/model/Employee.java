package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long e_id;
	@Column
    private String e_name;
	@Column
    private String e_type;
	/*
	 * @OneToMany(cascade = CascadeType.ALL) public List<Organisation> organisation;
	 * public List<Organisation> getOrganisation() { return organisation; } public
	 * void setOrganisation(List<Organisation> organisation) { this.organisation =
	 * organisation;
	 * }
	 */
	public Employee() {
	}
	public Employee( String e_name, String e_type) {
		super();
		
		this.e_name = e_name;
		this.e_type = e_type;
	}
	public long getE_id() {
		return e_id;
	}
	public void setE_id(Long e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_type() {
		return e_type;
	}
	public void setE_type(String e_type) {
		this.e_type = e_type;
	}
	/*
	 * public Organisation getOrganisation() { return organisation; } public void
	 * setOrganisation(Organisation organisation) { this.organisation =
	 * organisation; }
	 */
}
