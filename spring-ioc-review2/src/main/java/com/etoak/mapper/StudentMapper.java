package com.etoak.mapper;

import com.etoak.bean.Student;

public class StudentMapper {
   public  Student  gitById(String id) {
	   return new Student("etoak",id);
   }
}
