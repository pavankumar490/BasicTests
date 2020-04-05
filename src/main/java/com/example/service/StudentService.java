package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bean.StudentBean;
import com.example.repository.IStudentRepo;

public class StudentService implements IStudentService{
	
	@Autowired
	private IStudentRepo repo;

	@Override
	public StudentBean getStudent(Long sid) {
		// TODO Auto-generated method stub
		return  repo.getStudent(sid);
		
	}

	@Override
	public List<StudentBean> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.getAllStudents();
	}

	@Override
	public StudentBean updateStudent(Long sid, String scourse) {
		// TODO Auto-generated method stub
		return repo.updateStudent(sid, scourse);
	}

}
