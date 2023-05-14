package in.ineuron.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

		// array
		String nickNames[] = new String[] { "sachin", "saurav", "dravid", "kohli" };

		// List
		List<String> coursesList = List.of("java", "spring", "spring boot", "hibernate");

		// Set
		Set<Long> mobilePhonesSet = new HashSet<Long>();
		mobilePhonesSet.add(9999999L);
		mobilePhonesSet.add(8888888L);

		// Map
		Map<String, Long> idsMap = Map.of("aadhar", 4543535L, "voterId", 53543543534L, "panNo", 4545355454L);

		// Creating a ModelAttributes
		map.put("nickNames", nickNames);
		map.put("phonesInfo", mobilePhonesSet);
		map.put("coursesInfo", coursesList);
		map.put("idsInfo", idsMap);

		return "show_report";
	}
}