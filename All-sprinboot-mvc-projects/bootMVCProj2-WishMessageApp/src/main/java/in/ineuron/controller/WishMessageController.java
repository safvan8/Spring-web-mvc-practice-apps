package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService service;

	// configuring index page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public ModelAndView getWishMessage() {
		ModelAndView mav = new ModelAndView();

		// collect business result from service
		String msg = service.generateWishMessage();

		// setting Logical view name of the page for View Resolver
		mav.setViewName("resultPage");
		// sending data from Controller to view by adding map Object,
		// this Map Object will be by default saved in request scope
		mav.addObject("msgKey", msg);

		return mav;
	}
}
