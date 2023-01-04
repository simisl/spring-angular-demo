/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mysqloperations.mysqlcrud.repositories;

import com.mysqloperations.mysqlcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author simisl
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
