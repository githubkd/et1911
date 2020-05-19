package com.etoak.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;


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
} 
