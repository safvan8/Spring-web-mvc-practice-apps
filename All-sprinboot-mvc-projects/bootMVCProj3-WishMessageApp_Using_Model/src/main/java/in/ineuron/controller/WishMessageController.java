package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String getWishMessage(Model model) {

		// collect business result from service
		String msg = service.generateWishMessage();
		
		System.out.println("SharedMemory object class name is :: " + model.getClass().getName());
		
		model.addAttribute("wmg", msg);

		return "resultPage"; // WEB-INF/pages/resultPage.jsp
	}
}
