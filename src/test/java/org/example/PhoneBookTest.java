package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {
    @Test
    public void testAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("John Smit", "123456789"));
        assertEquals(2, phoneBook.add("Jane Smit", "987654321"));
    }

    @Test
    public void testFindbyNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Smit", "123456789");
        phoneBook.add("Jane Smit", "987654321");
        assertEquals("John Smit", phoneBook.findbyNumber("123456789"));
        assertEquals("Jane Smit", phoneBook.findbyNumber("987654321"));
        assertNull(phoneBook.findbyNumber("000000000"));
    }
}