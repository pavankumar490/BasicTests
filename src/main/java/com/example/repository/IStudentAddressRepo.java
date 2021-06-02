package com.example.repository;

import java.util.List;

import com.example.bean.StudentAddressBean;

public interface IStudentAddressRepo {
	public  StudentAddressBean getStudentAddress(int sid);
	public List<StudentAddressBean> getAllStudentsAddress();
	public StudentAddressBean updateStudentAddress(int sid, String scourse);
}
