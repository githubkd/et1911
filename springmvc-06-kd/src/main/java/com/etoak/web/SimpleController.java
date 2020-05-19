package com.etoak.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etoak.bean.Student;

@Controller
@RequestMapping("/simple")
public class SimpleController {
     @RequestMapping("/add")
     public String add(@RequestParam(required=false,defaultValue="1") int id,String name,HttpServletRequest request) {
         request.setAttribute("result", id+ ":"+name);
         return "param";
  }
     
    @RequestMapping("/list")
    public ModelAndView list
    (@RequestParam(required=false,defaultValue="3") int id,String name) {
    	ModelAndView modelAndView=new ModelAndView();
    	modelAndView.addObject("result","ModelAndView");
    	modelAndView.setViewName("param");
    	return modelAndView;
    }
    @GetMapping("/show")
    public String show(Student student,Model model) {
    	System.out.print(student.getId()+":"+student.getName());
    	model.addAttribute("result", "Model");
    	return "forward:/simple/list?name=etoak&id=666";
    
    }
    
}
