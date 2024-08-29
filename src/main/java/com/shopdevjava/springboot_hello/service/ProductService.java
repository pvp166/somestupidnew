package com.shopdevjava.springboot_hello.service;

import com.shopdevjava.springboot_hello.enity.ProductEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity product);
    
    List<ProductEntity> findAllProducts();
}
