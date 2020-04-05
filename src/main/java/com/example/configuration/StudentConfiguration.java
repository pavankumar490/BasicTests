package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.IStudentRepo;
import com.example.repository.StudentPersistance;
import com.example.service.IStudentService;
import com.example.service.StudentService;

@Configuration
public class StudentConfiguration {
	
	@Bean
	public IStudentService service(){
		return new StudentService();
	}

	@Bean
	public IStudentRepo repo(){
		return new StudentPersistance();
	}
	
}
