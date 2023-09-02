package org.example.enums;

public enum TransactionStatus {
    IN_PROCESSING ("В процессе"),
    SUCCESSFUL ("Успех"),
    PENDING ("На стадии проверки"),
    EXPIRED ("Просроченная оплата"),
    REFUNDED ("Возвращение стредств"),
    DECLINED ("Отклонение");

    private String title;

    public String getTitle() {
        return title;
    }

    TransactionStatus(String title) {
        this.title = title;
    }

}
