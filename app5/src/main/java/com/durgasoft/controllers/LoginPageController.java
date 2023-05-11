package com.durgasoft.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("status")
@org.springframework.stereotype.Controller
public class LoginPageController {
	// no need to implement Controller interface, if we use @Contrller annotation
	// no need to implement handle method
	@RequestMapping("/loginpage")
	public String login() throws Exception {
		// no need to accept ModelMap if we don't want to add anything to
		// sessionAttribute
		return "loginform";
	}

	@RequestMapping("/authenticateUser")
	public String authenticateCredentails(@RequestParam("uname") String uname,
			@RequestParam("password") String password, ModelMap map) throws Exception {

		if ("safvan".equals(uname.toLowerCase()) && "123".equals(password))
			map.addAttribute("status", "Login Success");
		else
			map.addAttribute("status", "Login Failed");
		return "outputPage";
	}
}

/**
 * The ModelMap parameter in the authenticateCredentials method is used to add
 * the login status message as an attribute to the session. This is done by
 * calling the addAttribute() method of the ModelMap object and passing in the
 * attribute name and value. The @SessionAttributes annotation is used to
 * indicate that the attribute named "status" should be stored in the HTTP
 * session so that it can be accessed by other methods in the controller.
 * 
 * The String return type of the authenticateCredentials method indicates the
 * logical view name that should be used to render the response. In this case,
 * the method returns the string "outputPage", which maps to the file name of
 * the JSP page that will be used to display the login status message.
 * 
 * The ModelMap parameter is not mandatory, but it is useful for passing data
 * between the controller and the view. If the controller does not need to pass
 * any data to the view, the ModelMap parameter can be omitted.
 * 
 * Overall, the ModelMap parameter and @SessionAttributes annotation are used
 * together to store data in the HTTP session and make it available to other
 * methods in the controller.
 */