package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bean.StudentBean;

@Service
public interface IStudentService {
	public StudentBean getStudent(Long sid);
	public List<StudentBean> getAllStudents();
	public StudentBean updateStudent(Long sid, String scourse);

}
