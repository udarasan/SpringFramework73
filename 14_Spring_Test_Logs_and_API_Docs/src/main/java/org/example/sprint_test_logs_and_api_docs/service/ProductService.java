package org.example.sprint_test_logs_and_api_docs.service;

import org.example.sprint_test_logs_and_api_docs.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
}
