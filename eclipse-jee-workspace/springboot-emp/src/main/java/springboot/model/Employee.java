package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name="ename",nullable=false)
private String ename;

@Column(name="dep")
private String dep;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
public Employee(long id, String ename, String dep) {
	super();
	this.id = id;
	this.ename = ename;
	this.dep = dep;
}

}