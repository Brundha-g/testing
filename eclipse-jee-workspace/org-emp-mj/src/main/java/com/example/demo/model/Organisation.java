package com.example.demo.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Organisation {
	@Id
	private Long o_id;
	private String o_name;
	public Organisation(Long o_id, String o_name) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
	}
	public Organisation() {
		super();
	}

	public Long getO_id() {
		return o_id;
	}
	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
}
