package com.etoak.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HelloController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		System.out.println(name);
		request.setAttribute("result", "hello"+name);
		request.getRequestDispatcher("/Hello.jsp").forward(request, response);

	}

}
