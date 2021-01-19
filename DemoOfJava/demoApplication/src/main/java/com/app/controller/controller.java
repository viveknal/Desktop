package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.stuserviceI;

@RestController
@RequestMapping(path="/master")
public class controller {
	@Autowired
	stuserviceI hs;
@RequestMapping(value="/student", method= RequestMethod.POST)
public Student saveStudent(@RequestBody Student stu) {
	
	return stu;
	}
	 @RequestMapping(value = "/getstudent", method=RequestMethod.GET)
	    public List<Student> getAllData()
	    {
	        List<Student> list = hs.getAllData();
	        
	        return list;
	    }
	
	
}
	
	


