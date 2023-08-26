package org.example.entity;

import org.example.enums.TransactionTypes;

import java.util.Date;
import java.util.List;

public class Transaction {
    private int id;
    private TransactionTypes transactionType;
    private double sum;
    private int recipientId;
    private int senderId;
    private Date dateTransaction;
    private boolean successfully;
}
