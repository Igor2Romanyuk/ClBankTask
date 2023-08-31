package org.example.entity;

import lombok.Getter;
import org.example.enums.TransactionTypes;
import org.example.functions.Create;

import java.time.LocalDateTime;

@Getter
public class Transaction {
    private int id;
    private LocalDateTime dateTransaction;
    private double sum;
    private int recipientId;
    private int senderId;
    private TransactionTypes transactionType;

    public Transaction(double sum, int recipientId, int senderId) {
        this.id = Create.id(Transaction.class);
        this.dateTransaction = LocalDateTime.now();
        this.sum = sum;
        this.recipientId = recipientId;
        this.senderId = senderId;
        // дописать логику типа транзакции
        this.transactionType = TransactionTypes.SUCCESSFUL;
    }
}
