package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class College {
	
	@Id
	private long id;
	private String collegeAdmin;
	private String location;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(long id, String collegeAdmin, String location) {
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.location = location;
	}
	
	

}
