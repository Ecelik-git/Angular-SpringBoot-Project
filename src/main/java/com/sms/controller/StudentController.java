package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;

@RestController
@RequestMapping("api/v1/")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}

}










