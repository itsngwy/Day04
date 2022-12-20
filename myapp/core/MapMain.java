package myapp.core;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;


// MapMain, MapMain2 and BankAccount
public class MapMain {
    public static void main(String[] args) {

        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");

        // Create a simple Map
        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountId(), fred);
        accts.put(barney.getAccountId(), barney);
        accts.put(wilma.getAccountId(), wilma);
        accts.put(betty.getAccountId(), betty);

        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        // To get all the keys and put it in a set eg. [001, 002, 003, 004]
        Set<String> keys = accts.keySet();

        // to get all the values and store it in a collection 
        // [myapp.core.BankAccount@5fd0d5ae, myapp.core.BankAccount@2d98a335, myapp.core.BankAccount@16b98e56, myapp.core.BankAccount@7ef20235]
        Collection<BankAccount> values = accts.values();
        System.out.println(values);

        BankAccount acct;
        for (String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n", acctId, acct.getName());
        }
    }
}