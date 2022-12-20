package myapp.core;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

// MapMain, MapMain2 and BankAccount

public class MapMain2 {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        Map<String, BankAccount> accts = new HashMap<>();

        for (String n: names) {
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountId(), acct);
        }

        // Get all the keys together and put it in a set
        Set<String> keys = accts.keySet();
        System.out.println(keys); // [78536536, 273fba07, 567edae5, 79aa3e55]
        
        // Store all values into collection
        Collection<BankAccount> values = accts.values();
        System.out.println(values); // [myapp.core.BankAccount@404b9385, myapp.core.BankAccount@6d311334, myapp.core.BankAccount@682a0b20, myapp.core.BankAccount@3d075dc0]

        BankAccount acct;

        for (String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n", acctId, acct.getName());
        }
    }
}