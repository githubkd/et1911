package com.etoak.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//基本数据类型和String类型


@Controller
@RequestMapping("/simple")
public class SimpleController {
     @RequestMapping("/servlet")
     public String servlet(HttpServletRequest request) {
    	 String name=request.getParameter("name");
    	 if(StringUtils.isEmpty(name)) {
    		 name="你好-世界";
    	 }
    	 request.setAttribute("result", name);
    	 return "param";
     }
     
     @RequestMapping(value="/simple",method= {RequestMethod.GET})
     public ModelAndView simple(
    		 @RequestParam(required=false,defaultValue="1") int id , String name) {   	 
    	 System.out.print(id);
    	 System.out.print(name);
    	 ModelAndView mv=new ModelAndView();
    	 mv.addObject("result","ModelAndView传值");
    	 mv.setViewName("param");
    	 return mv;
     }
     
} 
