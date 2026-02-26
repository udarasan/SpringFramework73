package org.example.sprint_test_logs_and_api_docs.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.sprint_test_logs_and_api_docs.entity.Product;
import org.example.sprint_test_logs_and_api_docs.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;
    @PostMapping("add")
    public void saveProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("get-all")
    public List<Product> findAll() {
        return productService.findAll();
    }
}
