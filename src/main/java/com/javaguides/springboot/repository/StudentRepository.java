package com.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
//OR
//public interface StudentRepository extends CrudRepository <Student, Long> { 
    List<Student> findByName(String name); 
}
