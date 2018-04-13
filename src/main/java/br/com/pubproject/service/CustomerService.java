package br.com.pubproject.service;

import java.util.List;

import br.com.pubproject.domain.Customer;
import br.com.pubproject.domain.CustomerRedis;

public interface CustomerService {

    List<Customer> listAllCustomer();

    void createCustomer(String cpf) throws Exception;

    Customer readCustomerByCpf(String cpf);

    void updateCustomer(Customer customer);

    void deleteCustomerByCpf(String cpf);

    void createCustomerRedis(CustomerRedis customerRedis);
}
