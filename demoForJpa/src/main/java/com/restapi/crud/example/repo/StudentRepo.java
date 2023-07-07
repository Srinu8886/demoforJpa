package com.restapi.crud.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.crud.example.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	//Student save(Student student);---> its created only for my purpose because of showing error in Studentcontroller class 

}
