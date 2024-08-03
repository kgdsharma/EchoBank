package com.kgds.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String CustomerId;
    private String accountNumber;
    private String accountType;
}
