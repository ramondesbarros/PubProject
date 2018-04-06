package br.com.pubproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pubproject.domain.Customer;
import br.com.pubproject.integration.CustomerRepository;
import br.com.pubproject.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void createCar(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer readCustomerByCpf(String cpf) {
        return customerRepository.findByCpf(cpf);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void deleteCustomerByCpf(String cpf) {
        customerRepository.deleteCustomerByCpf(cpf);
    }

}
