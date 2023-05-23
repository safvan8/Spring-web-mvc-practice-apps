package in.ineuron.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.ineuron.model.Customer;

public interface ICustomerDAO extends PagingAndSortingRepository<Customer, Integer> {

}
