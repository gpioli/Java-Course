package org.piolig.junit5app.examples.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountName() {
        Account account = new Account("Gaston", new BigDecimal(1000.12345));
        account.setPerson("Gaston");

        String expected = "Gaston";
        String real = account.getPerson();

        assertEquals(expected, real);
        assertTrue(real.equals("Gaston"));
    }

    @Test
    void testAccountBalance() {
        Account account = new Account("Gaston", new BigDecimal(1000.12345));
        assertEquals(1000.12345, account.getBalance().doubleValue());
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }
}