package com.durgasoft.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class LoginPageController {
// no need to implement Controller interface, if we use @Contrller annotation
// no need to implement handle method

	@RequestMapping("/loginpage")
	public ModelAndView anyMethodName(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("loginform");
	}

}
