/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysqloperations.mysqlcrud.controller;

import com.mysqloperations.mysqlcrud.entity.Student;
import com.mysqloperations.mysqlcrud.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author simisl
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getStudent() {
		return studentService.getStudent();
		
	}
    
}
