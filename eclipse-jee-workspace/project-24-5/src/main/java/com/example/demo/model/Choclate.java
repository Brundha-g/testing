package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "choclate")
public class Choclate {
	@Id
	private String name;
	private long cost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "f_id")
	private Flavour flavour;
	public Choclate() {
		super();
	}
	public Choclate(String name, long cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
}
