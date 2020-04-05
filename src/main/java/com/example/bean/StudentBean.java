package com.example.bean;

public class StudentBean {

	private String sname;
	private Long sid;
	private String courses;
	public StudentBean(Long sid, String sname, String scourse) {
		// TODO Auto-generated constructor stub
		this.sid=sid;
		this.sname=sname;
		this.courses=scourse;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long i) {
		this.sid = i;
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
