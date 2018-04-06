package br.com.pubproject.integration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.pubproject.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
