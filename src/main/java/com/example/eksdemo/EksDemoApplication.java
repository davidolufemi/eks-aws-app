package com.example.eksdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EksDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EksDemoApplication.class, args);
    }
}

@RestController
class DemoController {

    @GetMapping("/")
    public String home() {
        return "Welcome to EKS Version 2!!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}