package in.ineuron.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ineuron.dto.Employee;

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

		// passing and Array List of Object
		ArrayList<Employee> empsList = new ArrayList<>();
		empsList.add(new Employee(10, "sachin", "batsman", 90000.0));
		empsList.add(new Employee(7, "dhoni", "keeper", 190000.0));
		empsList.add(new Employee(18, "kohli", "captain", 180000.0));

		map.put("empsInfo", empsList);
		
		// To pass a Single object
		Employee ozil = new Employee(12, "Mesut Ozil", "Attacking Mid fielder", 32324334.0);
		map.put("footballer", ozil);

		return "show_report";
	}
}