package org.example.enums;

public enum TransactionTypes {
    REMITTANCE ("Перевод"),
    WITHDRAWAL ("Снятие"),
    REFILL ("Пополнение"),
    RECEIPT ("Поступление"),
    DEBIT ("Списание");

    private String title;

    public String getTitle() {
        return title;
    }

    TransactionTypes(String title) {
        this.title = title;
    }

}
