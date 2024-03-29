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
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void printAllNames() {
        for (String name : contacts.keySet()) {
            System.out.println(name);
        }
    }

}
