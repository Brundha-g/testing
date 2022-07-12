package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aid;
	private String animalname;
	private String Animaltype;
	public long getAid() {
		return aid;
	}
	public Animal(long aid, String animalname, String animaltype) {
		super();
		this.aid = aid;
		this.animalname = animalname;
		Animaltype = animaltype;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	public String getAnimaltype() {
		return Animaltype;
	}
	public void setAnimaltype(String animaltype) {
		Animaltype = animaltype;
	}
	public Animal() {
		super();
	}
	
	
}
