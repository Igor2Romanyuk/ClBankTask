package org.example.functions;

import org.example.entity.Transaction;
import org.example.enums.TransactionStatus;
import org.example.enums.TransactionTypes;

public interface FuncTransaction {
    //перевод
    public static Transaction remittance (double sum, int recipientId, int senderId, int recipientAccounId, int senderAccountId) {
        TransactionStatus ts = TransactionStatus.IN_PROCESSING;
        if (FuncAccount.isOwner(senderAccountId, senderId) && FuncAccount.isOwner(recipientAccounId, recipientId)){
            if (FuncAccount.enoughFunds(senderAccountId, sum)){
                FuncAccount.debit(senderAccountId, sum);
                FuncAccount.credit(recipientAccounId, sum);
                ts = TransactionStatus.SUCCESSFUL;
                return new Transaction(sum, recipientId, senderId, TransactionTypes.REMITTANCE, ts);
            }
        }  else {
            ts = TransactionStatus.DECLINED;
        }
        return new Transaction(sum, recipientId, senderId, TransactionTypes.REMITTANCE, ts);
    }

    //снятие наличных
    public static Transaction withdrawal (double sum, int senderId, int accountId) {
        TransactionStatus ts = TransactionStatus.IN_PROCESSING;
        if (FuncAccount.isOwner(accountId, senderId)){
            if (FuncAccount.enoughFunds(accountId, sum)){
                FuncAccount.debit(accountId, sum);
                ts = TransactionStatus.SUCCESSFUL;
                return new Transaction(sum, senderId, TransactionTypes.WITHDRAWAL, ts);
            }
        } else {
            ts = TransactionStatus.DECLINED;
        }
        return new Transaction(sum, senderId, TransactionTypes.WITHDRAWAL, ts);
    }

    //пополнение счета
    public static Transaction refill (double sum, int senderId, int accountId) {
        TransactionStatus ts = TransactionStatus.IN_PROCESSING;
        if (FuncAccount.isOwner(accountId, senderId)){
            FuncAccount.credit(accountId, sum);
            ts = TransactionStatus.SUCCESSFUL;
            return new Transaction(sum, senderId, TransactionTypes.REFILL, ts);
        } else {
            ts = TransactionStatus.DECLINED;
        }
        return new Transaction(sum, senderId, TransactionTypes.REFILL, ts);
    }

    //поступление средств
    public static Transaction receipt (double sum, int senderId, int accountId) {
        TransactionStatus ts = TransactionStatus.IN_PROCESSING;
        if (FuncAccount.isOwner(accountId, senderId)){
            FuncAccount.credit(accountId, sum);
            ts = TransactionStatus.SUCCESSFUL;
            return new Transaction(sum, senderId, TransactionTypes.RECEIPT, ts);
        } else {
            ts = TransactionStatus.DECLINED;
        }
        return new Transaction(sum, senderId, TransactionTypes.RECEIPT, ts);
    }

    //списание средств
    public static Transaction debit (double sum, int senderId, int accountId) {
        TransactionStatus ts = TransactionStatus.IN_PROCESSING;
        if (FuncAccount.isOwner(accountId, senderId)){
            FuncAccount.debit(accountId, sum);
            ts = TransactionStatus.SUCCESSFUL;
            return new Transaction(sum, senderId, TransactionTypes.DEBIT, ts);
        } else {
            ts = TransactionStatus.DECLINED;
        }
        return new Transaction(sum, senderId, TransactionTypes.DEBIT, ts);
    }
}
