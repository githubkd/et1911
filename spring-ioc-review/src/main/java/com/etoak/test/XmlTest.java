package com.etoak.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.action.UserAction;


public class XmlTest {

	public static void main(String[] args) {
       ApplicationContext application=
    		   new ClassPathXmlApplicationContext("applicationContext.xml");
      UserAction userAction=application.getBean(UserAction.class); 
      System.out.print(userAction.getById(100));
	}

}
