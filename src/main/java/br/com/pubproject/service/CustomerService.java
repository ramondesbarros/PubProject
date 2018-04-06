package br.com.pubproject.service;

import java.util.List;

import br.com.pubproject.domain.Customer;

public interface CustomerService {

    List<Customer> listAllCustomer();

    void createCar(Customer customer);

    Customer readCustomerByCpf(String cpf);

    void updateCustomer(Customer customer);

    void deleteCustomerByCpf(String cpf);
}
