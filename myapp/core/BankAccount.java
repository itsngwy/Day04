package myapp.core;

import java.util.UUID;


// MapMain, MapMain2 and BankAccount

public class BankAccount {

    private String name;
    private String accountId = UUID.randomUUID().toString().substring(0, 8);

    public BankAccount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAccountId() {
        return accountId;
    }
}
