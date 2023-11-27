package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    public void testAddContact(){
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("John Smit", "123456789"));
        assertEquals(2, phoneBook.add("Jane Smit", "987654321"));
    }


}