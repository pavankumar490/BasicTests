package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.bean.StudentAddressBean;

public class StudentAddressPersistance implements IStudentAddressRepo{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public StudentAddressBean getStudentAddress(int sid) {
		
		StudentAddressBean studentAddressBean= jdbcTemplate.queryForObject(
                "select *  from StudentAddress where HouseNumber = ?",
                new Object[]{sid},(rs, rowNum) ->
                new StudentAddressBean(
                		rs.getInt("HouseNumber"),
                        rs.getString("SName"),
                        rs.getString("SCourse")
                )
);
               
       System.out.println(studentAddressBean);
		return studentAddressBean;
		
		
		
	}

	@Override
	public List<StudentAddressBean> getAllStudentsAddress() {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query(
                "select * from StudentAddress ;",
                (rs, rowNum) ->
                        new StudentAddressBean(
                                rs.getInt("HouseNumber"),
                                rs.getString("VillageName"),
                                rs.getString("MandalName")
                        )
        );
	}

	@Override
	public StudentAddressBean updateStudentAddress(int sid, String scourse) {
			jdbcTemplate.update("update StudentAddress set Scourse=? where SId=?",scourse,sid);
			
			return  jdbcTemplate.queryForObject(
	                "select *  from StudentAddress where sid = ?",
	                new Object[]{sid},(rs, rowNum) ->
	                new StudentAddressBean(
	                		rs.getInt("HouseNumber"),
	                        rs.getString("VillageName"),
	                        rs.getString("MandalName")
	                )
	);
		
		
	}

}
