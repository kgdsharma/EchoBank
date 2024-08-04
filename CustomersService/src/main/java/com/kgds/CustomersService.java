package com.kgds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersService {

    public static void main(String[] args) {
        SpringApplication.run(CustomersService.class, args);
        System.out.println("Service started successfully");
        System.out.println("Service started successfully on port 8081");
        for (int i = 0; i < 10; i++) {
            System.out.println("Service started successfully on port 8084");

        }
    }

}
