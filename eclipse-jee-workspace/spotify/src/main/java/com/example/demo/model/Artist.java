package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Artist {
	@Id
	private String a_name;
	private String bio;
	private String dob;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Songs> songs;

	public Artist(String a_name, String bio, String dob,List<Songs> songs) {
		
		this.a_name = a_name;
		this.bio = bio;
		this.dob = dob;
		this.songs=songs;
	}

	public Artist() {
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<Songs> getSongs() {
		return songs;
	}

	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	

}
