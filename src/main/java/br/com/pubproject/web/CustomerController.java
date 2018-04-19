package br.com.pubproject.web;

import static br.com.pubproject.domain.PubProjectConstants.CUSTOMER_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pubproject.domain.Customer;
import br.com.pubproject.domain.CustomerRedis;
import br.com.pubproject.service.CustomerService;

@RestController
@RequestMapping(CUSTOMER_ENDPOINT)
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody String cpf) throws Exception {
        customerService.createCustomer(cpf);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> read() {
        return new ResponseEntity<List<Customer>>(customerService.listAllCustomer(), HttpStatus.OK);
    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable String cpf) {
        customerService.deleteCustomerByCpf(cpf);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void readCustomerByCpf(@PathVariable String cpf) {
        customerService.readCustomerByCpf(cpf);
    }

    @PostMapping(value = "/redis/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createCustomerRedis(@RequestBody CustomerRedis customerRedis) throws Exception {
        customerService.createCustomerRedis(customerRedis);
    }

}
