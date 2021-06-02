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

import com.example.bean.StudentAddressBean;
import com.example.service.IStudentAddressService;

	@RestController
	@RequestMapping("/studentAddress")
	public class StudentAddressController {
		
		@Autowired
		private IStudentAddressService studentAddressService;
		
		@PostMapping("/insertStudentAddress")
			public int insertStudentAddress(){
			System.out.println("insertStudentAddress  method");
			return 0;
			
		}
		
		
		@GetMapping(path="/singleStudentAddress/{sid}")
			public ResponseEntity<StudentAddressBean> getStudentAddress(@PathVariable int sid){
			System.out.println("single student method");
			return new ResponseEntity(studentAddressService.getStudentAddress(sid),HttpStatus.OK);
		}
		
		@GetMapping("/allStudentsAddress")
		public ResponseEntity<StudentAddressBean> getStudentsAddress(){
			System.out.println("all students method");
			return new ResponseEntity(studentAddressService.getAllStudentsAddress(),HttpStatus.OK);
		}
		@DeleteMapping("/deleteStudentAddress")
		public int removeStudentAddress(int sid){
			System.out.println("remove student method");
			return 0;
		}
		
		@PutMapping("/updateStudentAddress")
		public ResponseEntity updateStudentAddress(@RequestParam Long sid,@RequestParam String scourse){
			System.out.println("update student method");
			if(sid!=null&& !scourse.isEmpty()&& scourse!=null){
				return new ResponseEntity(studentAddressService.updateStudentAddress(sid, scourse),HttpStatus.OK);
			}else{
				return new ResponseEntity("You have tried invalid request",HttpStatus.BAD_REQUEST);
				
			}
		}
	}



