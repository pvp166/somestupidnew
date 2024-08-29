package com.shopdevjava.springboot_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("v1/api/hell")
    public String Hell() {
        return "Hello, Tip";
    }
}