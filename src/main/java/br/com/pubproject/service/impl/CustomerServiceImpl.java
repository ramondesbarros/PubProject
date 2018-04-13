package br.com.pubproject.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pubproject.domain.Customer;
import br.com.pubproject.domain.CustomerRedis;
import br.com.pubproject.integration.CustomerRedisRepository;
import br.com.pubproject.integration.CustomerRepository;
import br.com.pubproject.service.CustomerService;
import br.com.pubproject.service.impl.validate.CustomerServiceImplValidate;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerRedisRepository customerRedisRepository;

    @Autowired
    private CustomerServiceImplValidate customerServiceImplValidate;

    @Override
    public List<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(String id) throws Exception {

        try {
            CustomerRedis customerRedis = customerRedisRepository.findById(id).get();
            Customer customer = new Customer();
            customer = customerServiceImplValidate.validate(customerRedis);
            customerRepository.save(customer);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Elemento nao encontrado!");
        }
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

    @Override
    public void createCustomerRedis(CustomerRedis customerRedis) {
        customerRedisRepository.save(customerRedis);
    }
}
