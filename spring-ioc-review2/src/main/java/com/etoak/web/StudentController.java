package com.etoak.web;

import com.etoak.bean.Student;
import com.etoak.service.StudentService;

public class StudentController {
   private StudentService studentService;
   
   public void setStudentService(StudentService studentService) {
	this.studentService = studentService;
}

public Student gitById(String id) {
	   return studentService.gitById(id);
   }
}
