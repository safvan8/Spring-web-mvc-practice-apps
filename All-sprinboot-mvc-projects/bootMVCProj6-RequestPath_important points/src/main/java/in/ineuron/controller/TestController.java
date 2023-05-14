package in.ineuron.controller;

import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestController {

	@Autowired
	private ServletContext context;

	@Autowired
	private ServletConfig config;

	@Autowired
	private HttpSession session;

	@RequestMapping
	public String showIndexPage() {
		return "index";
	}

	@GetMapping("/report")
	public String showResport(Map<String, Object> map)
	{
	  System.out.println("TestController.showResport(-)");
	  System.out.println("Web app name is :"+context.getContextPath());
	  System.out.println("DS logical name is :"+ config.getServletName());
	  System.out.println("Session id is :"+session.getId());
	  
	  return "pageOne";
	}

}
