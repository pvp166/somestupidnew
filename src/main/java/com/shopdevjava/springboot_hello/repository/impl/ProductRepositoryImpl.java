package com.shopdevjava.springboot_hello.repository.impl;

import com.shopdevjava.springboot_hello.enity.ProductEntity;
import com.shopdevjava.springboot_hello.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("Tip Java");
        productEntity.setProductPrice(new BigDecimal("21.6"));
        return productEntity;
    }

    public List<ProductEntity> findAllProducts() {
        return List.of();
    }
}
