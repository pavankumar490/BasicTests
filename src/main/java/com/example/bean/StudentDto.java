package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDto {
	


	private String sname;
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long sid;
	private String courses;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StudentBean [sname=" + sname + ", sid=" + sid + ", courses=" + courses + "]";
	}
	
	
	
	


}
