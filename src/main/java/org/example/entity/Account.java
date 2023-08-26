package org.example.entity;

import org.example.enums.Valuta;

import java.util.List;

public class Account {
    private int id;
    private String number;
    private int balance;
    private Valuta cy;
    private int bankId;
    private int userId;
    private List<Integer> transactionIds;
}
