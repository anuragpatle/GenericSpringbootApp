package com.rest_and_mvc_example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest_and_mvc_example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
//OR
//public interface StudentRepository extends CrudRepository <Student, Long> { 
    List<Student> findByName(String name); 
}
