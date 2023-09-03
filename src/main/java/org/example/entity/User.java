package org.example.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.example.functions.Create;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String fullName;
    private List<Integer> accountIds;

    public User(String fullName) {
        this.fullName = fullName;
        this.id = Create.id(User.class);
    }

    public User(String fullName, Account account) {
        this.fullName = fullName;
        this.id = Create.id(User.class);
        accountIds.add(account.getId);
    }

    public void addAccount (Account account){
        accountIds.add(account.getId);
    }

    public void deleteAccount (Account account){
        accountIds.remove(account.getId);
    }
}
