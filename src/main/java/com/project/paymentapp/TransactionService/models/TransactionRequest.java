package com.project.paymentapp.TransactionService.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionRequest {
    private String toUser;
    private Double amount;
    private TransactionType txType;
}
