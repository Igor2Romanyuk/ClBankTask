package org.example.functions;

import org.example.enums.TransactionTypes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FuncCheck {
    private static final String FOLDER_CHECK = "folderCheck"; //обработать путь

    //чек перевода
    public static void remittance (double sum, int transactionId, int recipientId, int senderId, int recipientAccounId, int senderAccountId){

    }

    private void build (int transactionId){
        //изъять дату транзакции и тип транзакции
        LocalDateTime timeTransaction = LocalDateTime.now();
        TransactionTypes transactionType = TransactionTypes.REMITTANCE;
        try{
            Path folderCheck = Paths.get(FOLDER_CHECK);
            Files.createDirectory(folderCheck);
            //дописать дату транзакции
            String checkName = folderCheck.resolve("check_" + "дата транзакции" + ".txt").toString();
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(checkName))) {
                timeTransaction.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
                String textChecks = "";
                if (transactionType == TransactionTypes.REMITTANCE){
                    textChecks = remittanceBuild(transactionId, timeTransaction);
                } else {
                    textChecks = otherBuild();
                }
                printWriter.println(textChecks);
                System.out.println("Чек " + checkName + " сохранен");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String remittanceBuild (int transactionId, LocalDateTime transactionDate){
         StringBuilder stringBuilder = new StringBuilder();
         String line = "----------------------------------------\n";
         stringBuilder.append(line)
                 .append("|               Банковский Чек                  |\n")
                 .append("|Чек:             ").append(spaces(String.valueOf(transactionId))).append("|\n")
                 .append("|                 ").append(spaces(transactionDate.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss")))).append("|\n")
                 .append("|тип транзакции:  ").append(spaces(TransactionTypes.REMITTANCE.getTitle())).append("|\n")
                 .append("|Банк отправителя:").append(spaces(senderBank)).append("|\n")
                 .append("|Банк получателя: ").append(spaces(recieverBank)).append("|\n")
                 .append("|Счет отправителя:")
    }
    
    private String spaces(String s){

    }
}
