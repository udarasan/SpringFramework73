package org.example.sprint_test_logs_and_api_docs.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.sprint_test_logs_and_api_docs.entity.Product;
import org.example.sprint_test_logs_and_api_docs.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/product")
@Slf4j
public class ProductController {
    private final ProductService productService;
    @PostMapping("add")
    public void saveProduct(@RequestBody Product product) {
        log.info("Saving product");
        log.debug("Saving product {}",product);
        log.warn("Warning log");
        log.trace("Warning trace log");
        log.error("Warning log");
        productService.save(product);
    }

    @GetMapping("get-all")
    public List<Product> findAll() {
        log.info("getAll");
        return productService.findAll();
    }
}
