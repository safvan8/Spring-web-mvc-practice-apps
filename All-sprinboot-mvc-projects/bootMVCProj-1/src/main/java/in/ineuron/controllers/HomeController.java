package in.ineuron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showHomePage() {

		return "homePage";
	}
}

/**
 * In Spring MVC, the @Controller annotation is used to mark a class as a
 * controller component. It is a specialized version of the @Component
 * annotation and includes additional functionality specific to web
 * applications.
 * 
 * Internally, the @Controller annotation combines the functionality
 * of @Component with the ability to handle HTTP requests through
 * the @RequestMapping annotation. 
 * When Spring scans the application for components, 
 * it identifies any classes annotated with @Controller and creates
 * a bean instance for them in the application context.
 */
