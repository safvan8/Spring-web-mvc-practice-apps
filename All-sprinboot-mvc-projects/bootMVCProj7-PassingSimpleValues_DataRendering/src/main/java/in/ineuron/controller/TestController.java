package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("TestController.showReport()");
		map.put("name", "kohli");
		map.put("age", 35);
		map.put("address", "RCB");
		return "show_report";
	}
}