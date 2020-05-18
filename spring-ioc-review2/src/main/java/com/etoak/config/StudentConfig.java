package com.etoak.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.mapper.StudentMapper;
import com.etoak.service.StudentService;
import com.etoak.web.StudentController;

@Configuration
public class StudentConfig {
       @Bean("studentMapper")
       public StudentMapper studentMapper() {
    	   return new StudentMapper();
       }
       @Bean("studentService")
       public StudentService studentService(@Qualifier("studentMapper") StudentMapper studentMapper) {
    	      StudentService studentService=new StudentService();
    	      studentService.setStudentMapper(studentMapper);
    	      return studentService;
       }
       @Bean("studentController")
       public StudentController studentController(@Qualifier("studentService") StudentService studentService) {
    	   StudentController studentController=new StudentController();
    	   studentController.setStudentService(studentService);
    	   return studentController;
       }
}
