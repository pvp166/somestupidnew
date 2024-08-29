package com.shopdevjava.springboot_hello.enity.user;

import jakarta.persistence.Entity;

@Entity
public class UserEntity {
    private Long id;
    private String userName;
    private String userEmail;
}
