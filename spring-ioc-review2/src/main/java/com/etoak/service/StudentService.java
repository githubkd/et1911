package com.etoak.service;

import com.etoak.bean.Student;
import com.etoak.mapper.StudentMapper;

public class StudentService {
    private StudentMapper studentMapper;
    
  

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public  Student gitById(String id) {
    	return studentMapper.gitById(id);
    } 
    
}
