package org.example.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.example.enums.TransactionStatus;
import org.example.enums.TransactionTypes;
import org.example.functions.Create;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
public class Transaction {
    private int id;
    private LocalDateTime dateTransaction;
    private double sum;
    private int recipientId;
    private int senderId;
    private TransactionStatus transactionStatus;
    private TransactionTypes transactionType;

    public Transaction(double sum, int recipientId, int senderId, TransactionTypes tt, TransactionStatus ts) {
        this.id = Create.id(Transaction.class);
        this.dateTransaction = LocalDateTime.now();
        this.sum = sum;
        this.recipientId = recipientId;
        this.senderId = senderId;
        this.transactionType = tt;
        this.transactionStatus = ts;
    }

    public Transaction(double sum, int senderId, TransactionTypes tt, TransactionStatus ts) {
        this.id = Create.id(Transaction.class);
        this.dateTransaction = LocalDateTime.now();
        this.sum = sum;
        this.senderId = senderId;
        this.transactionType = tt;
        this.transactionStatus = ts;
    }
}
