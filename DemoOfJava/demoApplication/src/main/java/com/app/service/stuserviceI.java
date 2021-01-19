package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface stuserviceI {
	
	public void saveStudent(Student stu);
	

	List<Student> getAllData();
}
