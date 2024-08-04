package com.kgds.controllers;

import com.kgds.models.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts() {

        List<Account> accounts = List.of(
                Account.builder().CustomerId("1").accountNumber("1234").accountType("Savings").build(),
                Account.builder().CustomerId("2").accountNumber("5678").accountType("Current").build(),
                Account.builder().CustomerId("3").accountNumber("91011").accountType("Savings").build(),
                Account.builder().CustomerId("4").accountNumber("121314").accountType("Current").build(),
                Account.builder().CustomerId("5").accountNumber("151617").accountType("Savings").build(),
                Account.builder().CustomerId("6").accountNumber("181920").accountType("Current").build(),
                Account.builder().CustomerId("7").accountNumber("212223").accountType("Savings").build(),
                Account.builder().CustomerId("8").accountNumber("242526").accountType("Current").build(),
                Account.builder().CustomerId("9").accountNumber("272829").accountType("Savings").build(),
                Account.builder().CustomerId("10").accountNumber("303132").accountType("Current").build(),
                Account.builder().CustomerId("11").accountNumber("333435").accountType("Savings").build(),
                Account.builder().CustomerId("12").accountNumber("363738").accountType("Current").build(),
                Account.builder().CustomerId("13").accountNumber("394041").accountType("Savings").build(),
                Account.builder().CustomerId("14").accountNumber("424344").accountType("Current").build(),
                Account.builder().CustomerId("15").accountNumber("454647").accountType("Savings").build()
        );
        return ResponseEntity.ok(accounts);
    }
}
