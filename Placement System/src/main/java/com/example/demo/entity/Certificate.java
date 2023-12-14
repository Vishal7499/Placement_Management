package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
	@Id
	private long id;
	private int year;
	private String college;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Certificate(long id, int year, String college) {
		super();
		this.id = id;
		this.year = year;
		this.college = college;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
