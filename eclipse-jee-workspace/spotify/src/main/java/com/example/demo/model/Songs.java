package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Songs {
@Id
private String s_name;
private String r_date;
private String coverimage;
public Songs(String s_name, String r_date, String coverimage) {
	super();
	this.s_name = s_name;
	this.r_date = r_date;
	this.coverimage = coverimage;
}
public Songs() {
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getR_date() {
	return r_date;
}
public void setR_date(String r_date) {
	this.r_date = r_date;
}
public String getCoverimage() {
	return coverimage;
}
public void setCoverimage(String coverimage) {
	this.coverimage = coverimage;
}

}
