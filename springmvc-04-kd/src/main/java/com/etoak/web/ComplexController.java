package com.etoak.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etoak.bean.Student;

@Controller
@RequestMapping("/complex")
public class ComplexController {
     @GetMapping("/bean")
     public String bean(Student student,Model model) {
    	 System.out.print(student);
    	 model.addAttribute("result2","Model");
    	 return "forward:/simple/simple?id=123";
     }
}
