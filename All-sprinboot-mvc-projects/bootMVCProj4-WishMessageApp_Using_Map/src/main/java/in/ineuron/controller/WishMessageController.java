package in.ineuron.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String getWishMessage(Map map) {

		// collect business result from service
		String msg = service.generateWishMessage();

		// saving Model class objects to Map
		map.put("wmg", msg);

		return "resultPage"; // WEB-INF/pages/resultPage.jsp
	}
}
