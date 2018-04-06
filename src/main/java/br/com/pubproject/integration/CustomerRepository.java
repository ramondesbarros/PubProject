package br.com.pubproject.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pubproject.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByCpf(String cpf);

    void deleteCustomerByCpf(String cpf);
}
