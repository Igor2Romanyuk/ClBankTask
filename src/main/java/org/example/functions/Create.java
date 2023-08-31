package org.example.functions;

import org.example.entity.Account;
import org.example.entity.Bank;
import org.example.entity.Transaction;
import org.example.entity.User;

public class Create {
    private static int userId = 0;
    private static int transactionId = 0;
    private static int bankId = 0;
    private static int accountId = 0;

    public static int id (Object o) {
        if (o.getClass() == Account.class) {
            return accountId++;
        }
        if (o.getClass() == Bank.class) {
            return bankId++;
        }
        if (o.getClass() == Transaction.class) {
            return transactionId++;
        }
        if (o.getClass() == User.class) {
            return userId++;
        }
        return -1;
    }
}
