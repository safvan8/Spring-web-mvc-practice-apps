package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDAO;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDAO repo;

	@Override
	public List<Customer> getCustomers() {
		return (List<Customer>) repo.findAll();
	}

	@Transactional
	@Override
	public void saveCustomer(Customer customer) {

		repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {

		// Optional is a container object that may or may not contain a non-null value.
		// In this case, it is used to wrap a Customer object.
		Optional<Customer> customer = repo.findById(customerId);

		/**
		 * It returns an Optional containing the Customer object if it exists in the
		 * database, or an empty Optional if it doesn't.
		 * 
		 * The get() method of the Optional class is used to retrieve the Customer
		 * object from the Optional container. If the Optional is empty, calling get()
		 * will throw a NoSuchElementException. in this case, records mught be existed
		 * in DB
		 */

		return customer.get();

	}

	@Transactional
	@Override
	public void deleteById(Integer customerId) {

		repo.deleteById(customerId);
	}
}