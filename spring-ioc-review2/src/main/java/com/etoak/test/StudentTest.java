package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.config.StudentConfig;
import com.etoak.web.StudentController;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext application=
				new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentController studentController=application.getBean(StudentController.class);
        System.out.println(studentController.gitById("etoak-001"));
	}

}
