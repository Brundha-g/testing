package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Classname {
	  @Id
      private long cid;
      private String cname;
      private String dep;
      private String cteacher;
		/*
		 * @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
		 * 
		 * @JoinColumn(name="fk_id") private List<Student> student;
		 */   
	public Classname(long cid, String cname, String dep, String cteacher) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dep = dep;
		this.cteacher = cteacher;
	}
	public Classname() {
		super();
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getCteacher() {
		return cteacher;
	}
	public void setCteacher(String cteacher) {
		this.cteacher = cteacher;
	}
	/*
	 * public List<Student> getStudent() { return student; } public void
	 * setStudent(List<Student> student) { this.student = student; }
	 */
}
