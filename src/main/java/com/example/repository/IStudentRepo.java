package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.StudentBean;

@Repository
public interface IStudentRepo  {

	public  StudentBean getStudent(Long sid);
	public List<StudentBean> getAllStudents();
	public StudentBean updateStudent(Long sid, String scourse);
}
