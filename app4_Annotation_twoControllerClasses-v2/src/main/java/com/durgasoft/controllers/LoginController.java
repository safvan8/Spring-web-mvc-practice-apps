package com.durgasoft.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class LoginController {

	@RequestMapping("/authenticateUser")
	public ModelAndView authenticateCredentails(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String username = request.getParameter("uname").toLowerCase();
		String password = request.getParameter("password");

		if ("safvan".equals(username) && "123".equals(password))
			return new ModelAndView("success");

		return new ModelAndView("failed");
	}

}
