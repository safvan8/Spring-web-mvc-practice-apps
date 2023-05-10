package com.durgasoft.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("uname").toLowerCase();
		String password = request.getParameter("password");

		if ("safvan".equals(username) && "123".equals(password))
			return new ModelAndView("success");
		
		return new ModelAndView("failed");
	}

}
