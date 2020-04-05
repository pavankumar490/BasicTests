package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.StudentBean;
import com.example.service.IStudentService;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private IStudentService studentservice;
	
	@PostMapping("/insert")
		public int insertStudent(){
		System.out.println("insert method");
		return 0;
		
	}
	
	
	@GetMapping(path="/singleStudent/{sid}")
		public ResponseEntity<StudentBean> getStudent(@PathVariable Long sid){
		System.out.println("single student method");
		return new ResponseEntity(studentservice.getStudent(sid),HttpStatus.OK);
	}
	
	@GetMapping("/allStudents")
	public ResponseEntity<StudentBean> getStudents(){
		System.out.println("all students method");
		return new ResponseEntity(studentservice.getAllStudents(),HttpStatus.OK);
	}
	@DeleteMapping("/deleteStudent")
	public int removeStudent(int sid){
		System.out.println("remove student method");
		return 0;
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity updateStudent(@RequestParam Long sid,@RequestParam String scourse){
		System.out.println("update student method");
		if(sid!=null&& !scourse.isEmpty()&& scourse!=null){
			return new ResponseEntity(studentservice.updateStudent(sid, scourse),HttpStatus.OK);
		}else{
			return new ResponseEntity("You have tried invalid request",HttpStatus.BAD_REQUEST);
			
		}
	}
}
