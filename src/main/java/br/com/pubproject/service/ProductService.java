package br.com.pubproject.service;

import java.util.List;
import java.util.Optional;

import br.com.pubproject.domain.Product;

public interface ProductService {

    List<Product> listAllProducts();

    void createProduct(Product product);

    Optional<Product> readProduct(String id);

    void updateProduct(Product product);

    void deleteProduct(String id);

}
