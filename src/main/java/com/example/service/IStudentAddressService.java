package com.example.service;

import java.util.List;

import com.example.bean.StudentAddressBean;

public interface IStudentAddressService {
	public StudentAddressBean getStudentAddress(int sid);
	public List<StudentAddressBean> getAllStudentsAddress();
	public StudentAddressBean updateStudentAddress(Long sid, String scourse);

}
