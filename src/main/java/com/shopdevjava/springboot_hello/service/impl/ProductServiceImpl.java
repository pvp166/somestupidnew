package com.shopdevjava.springboot_hello.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopdevjava.springboot_hello.enity.ProductEntity;
import com.shopdevjava.springboot_hello.repository.ProductRepository;
import com.shopdevjava.springboot_hello.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
