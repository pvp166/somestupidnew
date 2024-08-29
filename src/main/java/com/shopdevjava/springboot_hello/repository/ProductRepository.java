package com.shopdevjava.springboot_hello.repository;

import com.shopdevjava.springboot_hello.enity.ProductEntity;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);
    
    List<ProductEntity> findAllProducts();
}
