package com.example.springbootdronetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDroneTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDroneTestApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "hello drone springboot";
    }

}
