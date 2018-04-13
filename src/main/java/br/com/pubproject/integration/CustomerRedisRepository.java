package br.com.pubproject.integration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pubproject.domain.CustomerRedis;

@Repository
public interface CustomerRedisRepository extends CrudRepository<CustomerRedis, String> {

    CustomerRedis findByCpf(String cpf);
}
