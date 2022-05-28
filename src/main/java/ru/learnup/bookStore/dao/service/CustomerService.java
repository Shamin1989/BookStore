package ru.learnup.bookStore.dao.service;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.dao.entity.Customer;
import ru.learnup.bookStore.dao.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public Customer getCustomerById(long id) {
        return customerRepository.getById(id);
    }


}
