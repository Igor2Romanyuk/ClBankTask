package org.example.entity;

import lombok.Getter;
import org.example.functions.Create;

import java.util.List;

@Getter
public class Bank {
    private int id;
    private String name;
    private String littleName;
    private String bic;
    private List<Integer> userIds;
    private List<Integer> accountIds;

    public Bank(int id, String name, String littleName) {
        this.id = Create.id(Bank.class);
        this.name = name;
        this.littleName = littleName; //дописать проверку
        StringBuilder bicBuilder = new StringBuilder(littleName.toUpperCase());
        bicBuilder.append("BY2X");
        this.bic = String.valueOf(bicBuilder);
    }

    public void addUser (User user){
        //userIds.add(user.getId);
    }

    public void deleteUser (User user){
        //userIds.remove(user.getId);
    }

    public void addAccount (Account account){
        //userIds.add(account.getId);
    }

    public void deleteAccount (Account account){
        //userIds.remove(account.getId);
    }


}
