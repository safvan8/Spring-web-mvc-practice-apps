package in.ineuron.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.model.Customer;
import in.ineuron.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping("/list")
	public String listCustomers(Map<String, Object> model) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
		List<Customer> customers = service.getCustomers();
		customers.forEach(System.out::println);
		model.put("customers", customers);
		return "list-customers";
	}

	@GetMapping("/showForm")
	public String showFormForAdd(Map<String, Object> model) {

		// adding empty customer object to map for displaying in Spring Taglib form
		// this will help in enabling 2 way binding
		Customer customer = new Customer();
		model.put("customer", customer);

		// going to form for getting edited customer objects
		// this is 2 way binding
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer);

		// sending object for saving to db
		service.saveCustomer(customer);

		// redirecting to the list page after saving automtaically, to check whether it
		// is added to table list
		return "redirect:/customer/list";
	}

	// for displaying edit form, Id is accessed through one way binding
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam Integer customerId, Map<String, Object> model) {
		Customer customer = service.getCustomer(customerId);
		System.out.println(customer);

		model.put("customer", customer);
		return "customer-form";
	}

	@GetMapping("/performDelete")
	public String deleteCustomer(@RequestParam Integer customerId) {
		service.deleteById(customerId);
		return "redirect:/customer/list";
	}

}