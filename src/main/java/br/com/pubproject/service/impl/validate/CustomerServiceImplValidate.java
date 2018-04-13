package br.com.pubproject.service.impl.validate;

import org.springframework.stereotype.Component;

import br.com.pubproject.domain.Customer;
import br.com.pubproject.domain.CustomerRedis;

@Component
public class CustomerServiceImplValidate {

    public Customer validate(CustomerRedis customerRedis) throws Exception {

        Customer customer = new Customer();

        if (customerRedis.getName() != null) {
            customer.setName(customerRedis.getName());
        } else {
            throw new Exception();
        }

        if (customerRedis.getCpf() != null) {
            customer.setCpf(customerRedis.getCpf());
        } else {
            throw new Exception();
        }

        if (customerRedis.getPhone() != null) {
            customer.setPhone(customerRedis.getPhone());
        } else {
            throw new Exception();
        }

        if (customerRedis.getEmail() != null) {
            customer.setEmail(customerRedis.getEmail());
        } else {
            throw new Exception();
        }

        return customer;
    }
}
