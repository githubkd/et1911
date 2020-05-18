package com.etoak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.etoak.web.BookController;

public class AnnotationTest {
    
	public static void main(String[] args) {
	  ApplicationContext application=
			  new ClassPathXmlApplicationContext("applicationContext.xml");
	  BookController bookController=application.getBean(BookController.class);
	  
	  
	  System.out.print(bookController.gitById("100"));
	}

}
