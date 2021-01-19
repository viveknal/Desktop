package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Student;
@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Student, Integer>{
	
	

}
