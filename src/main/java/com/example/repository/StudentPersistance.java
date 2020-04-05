package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.bean.StudentBean;

public class StudentPersistance implements IStudentRepo{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public StudentBean getStudent(Long sid) {
		
		StudentBean studentBean= jdbcTemplate.queryForObject(
                "select *  from student where sid = ?",
                new Object[]{sid},(rs, rowNum) ->
                new StudentBean(
                		rs.getLong("SId"),
                        rs.getString("SName"),
                        rs.getString("SCourse")
                )
);
               
       System.out.println(studentBean);
		return studentBean;
		
		
		
	}

	@Override
	public List<StudentBean> getAllStudents() {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query(
                "select * from student ;",
                (rs, rowNum) ->
                        new StudentBean(
                                rs.getLong("SId"),
                                rs.getString("SName"),
                                rs.getString("SCourse")
                        )
        );
	}

	@Override
	public StudentBean updateStudent(Long sid, String scourse) {
			jdbcTemplate.update("update student set Scourse=? where SId=?",scourse,sid);
			
			return  jdbcTemplate.queryForObject(
	                "select *  from student where sid = ?",
	                new Object[]{sid},(rs, rowNum) ->
	                new StudentBean(
	                		rs.getLong("SId"),
	                        rs.getString("SName"),
	                        rs.getString("SCourse")
	                )
	);
		
		
	}

}
