package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
