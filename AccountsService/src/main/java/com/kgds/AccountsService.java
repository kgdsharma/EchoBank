package com.kgds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountsService {

        public static void main(String[] args) {
            SpringApplication.run(AccountsService.class, args);
            System.out.print("AccountsService started successfully.");
            for (int i = 0; i < 10; i++) {
                System.out.println("Service started successfully on port 8083");

            }
        }
}
