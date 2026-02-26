package org.example.sprint_test_logs_and_api_docs;

import org.example.sprint_test_logs_and_api_docs.entity.Product;
import org.example.sprint_test_logs_and_api_docs.repo.ProductRepo;
import org.example.sprint_test_logs_and_api_docs.service.ProductService;
import org.example.sprint_test_logs_and_api_docs.service.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    private Product product;
    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepo productRepo;
    @BeforeEach
    public void setup() {
        product=Product.builder()
                .id(1).name("TestName").description("TestDescription").build();
    }
    @Test
    void saveProductTestCase(){
        //arrange
        when(productRepo.save(any(Product.class))).thenReturn(product);
        //action
        Product saveProduct=productService.save(product);

        //assert methods
        //Assertions.assertEquals(2,saveProduct.getId());
        Assertions.assertEquals("TestName",saveProduct.getName());
        Assertions.assertNotNull(saveProduct);
        Assertions.assertEquals(product,saveProduct);
        verify(productRepo,times(1)).save(any(Product.class));
    }
}
