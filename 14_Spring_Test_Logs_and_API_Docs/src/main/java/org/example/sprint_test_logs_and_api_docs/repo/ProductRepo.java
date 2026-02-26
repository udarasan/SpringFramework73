package org.example.sprint_test_logs_and_api_docs.repo;

import org.example.sprint_test_logs_and_api_docs.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
