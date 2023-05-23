package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {

	@GetMapping("/data")
	public String bindData(Map<String, Object> model, @RequestParam Integer sno,
			@RequestParam(defaultValue =  "Safvan") String sname) {
		System.out.println("DataBindingController.bindData()");
		System.out.println("SNO   is :: " + sno);
		System.out.println("SNAME is :: " + sname);
		return "show_data";
	}

//	@GetMapping("/data1")
//	public String bindData(Map<String, Object> model, @RequestParam Integer sno,
//			@RequestParam(defaultValue = "sachin") String sname) {
//		System.out.println("DataBindingController.bindData()");
//		System.out.println("SNO   is :: " + sno);
//		System.out.println("SNAME is :: " + sname);
//		return "show_data";
//	}
}
