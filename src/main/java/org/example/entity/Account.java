package org.example.entity;

import lombok.Getter;
import org.example.enums.Valuta;

import java.util.List;

@Getter
public class Account {
    @Getter
    private int id;
    private String number;
    private int balance;
    private Valuta cy;
    private int bankId;
    private int userId;
    private List<Integer> transactionIds;
}
