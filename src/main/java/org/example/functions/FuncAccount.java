package org.example.functions;

public interface FuncAccount {
    //списание
    public static void debit (int accountId, double sum){

    }

    //поступление
    public static void credit (int accountId, double sum){

    }

    //достаточно средств
    public static boolean enoughFunds (int accountId, double sum){
        return true;
    }

    public static boolean isOwner (int accountId, int userId){
        return true;
    }
}
