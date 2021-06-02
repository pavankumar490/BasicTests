package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bean.StudentAddressBean;
import com.example.repository.IStudentAddressRepo;

public class StudentAddressService {

	
	@Autowired
	private IStudentAddressRepo repo;

	public StudentAddressBean getStudentAddress(int sid) {
		// TODO Auto-generated method stub
		return  repo.getStudentAddress(sid);
		
	}

	public List<StudentAddressBean> getAllStudentsAddress() {
		// TODO Auto-generated method stub
		return repo.getAllStudentsAddress();
	}

	public StudentAddressBean updateStudentAddress(int sid, String scourse) {
		// TODO Auto-generated method stub
		return repo.updateStudentAddress(sid, scourse);
	}



}
