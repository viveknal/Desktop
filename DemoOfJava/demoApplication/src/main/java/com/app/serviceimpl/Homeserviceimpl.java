package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.Repository;
import com.app.service.stuserviceI;
@Service
public class Homeserviceimpl implements stuserviceI {
@Autowired
	Repository rs;
	@Override
	public void saveStudent(Student stu) {
		// TODO Auto-generated method stub
		rs.save(stu);
	}
	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		List<Student>ls=(List<Student>) rs.findAll();
		return ls;
	}

}
