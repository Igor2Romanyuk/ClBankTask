package org.example.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.example.enums.Valuta;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Account {
    private int id;
    private String number;
    private int balance;
    private Valuta cy;
    private int bankId;
    private int userId;
    private List<Integer> transactionIds;
}
