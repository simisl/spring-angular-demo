/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysqloperations.mysqlcrud.service;

import com.mysqloperations.mysqlcrud.entity.Student;
import com.mysqloperations.mysqlcrud.repositories.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author simisl
 */

@Service
public class StudentService {

    @Autowired
	StudentRepository studentRepository;

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
    
}
