package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();
    public int add(String name, String number){
        if(!contacts.containsKey(name)){
            contacts.put(name,number);
            return contacts.size();
        }
        return 0;
    }

    public String findbyNumber(String number){
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public String findByName(String name){
        return null;
    }

}
