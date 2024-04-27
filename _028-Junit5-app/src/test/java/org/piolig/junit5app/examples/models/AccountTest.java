package org.piolig.junit5app.examples.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.piolig.junit5app.examples.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountName() {
        Account account = new Account("Gaston", new BigDecimal(1000.12345));
        account.setPerson("Gaston");

        String expected = "Gaston";
        String real = account.getPerson();
        assertNotNull(real);

        assertEquals(expected, real);
        assertTrue(real.equals("Gaston"));
    }

    @Test
    void testAccountBalance() {
        Account account = new Account("Gaston", new BigDecimal(1000.12345));
        assertNotNull(account.getBalance());
        assertEquals(1000.12345, account.getBalance().doubleValue());
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }

    // different objects
    @Test
    void testAccountReference(){
        Account account = new Account("John Doe", new BigDecimal(89000.9997));
        Account account2 = new Account("John Doe", new BigDecimal(89000.9997));

        //assertNotEquals(account2, account);
        assertEquals(account2, account);
    }

    @Test
    void testAccountDebit() {
        Account account = new Account("Andres", new BigDecimal("1000.12345"));
        account.debit(new BigDecimal(100));
        assertNotNull(account.getBalance());
        assertEquals(900, account.getBalance().intValue());
        assertEquals("900.12345", account.getBalance().toPlainString());

    }

    @Test
    void testAccountCredit() {
        Account account = new Account("Andres", new BigDecimal("1000.12345"));
        account.credit(new BigDecimal(100));
        assertNotNull(account.getBalance());
        assertEquals(1100, account.getBalance().intValue());
        assertEquals("1100.12345", account.getBalance().toPlainString());
    }

    @Test
    void insufficientBalanceExceptionAccount() {
        Account account = new Account("Andres", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.debit(new BigDecimal(1500));
        });

        String actual = exception.getMessage();
        String expected = "Insufficient balance for the transaction.";

        assertEquals(expected, actual);
    }

    @Test
    void testTransference() {
        Account account = new Account("John Doe", new BigDecimal(2500));
        Account account2 = new Account("Andres", new BigDecimal("1500.8989"));

        Bank bank = new Bank();
        bank.setName("State Bank");
        bank.transference(account2, account, new BigDecimal(500));

        assertEquals("1000.8989", account2.getBalance().toPlainString());
        assertEquals("3000", account.getBalance().toPlainString());
    }

    @Test
    void testBankAccountsRelationship() {
        Account account = new Account("John Doe", new BigDecimal(2500));
        Account account2 = new Account("Andres", new BigDecimal("1500.8989"));

        Bank bank = new Bank();
        bank.addAccount(account);
        bank.addAccount(account2);
        bank.setName("State Bank");
        bank.transference(account2, account, new BigDecimal(500));

        assertEquals("1000.8989", account2.getBalance().toPlainString());
        assertEquals("3000", account.getBalance().toPlainString());

        assertEquals(2, bank.getAccounts().size());
        assertEquals("State Bank", account.getBank().getName());

        assertEquals("Andres", bank.getAccounts().stream()
                .filter(c -> c.getPerson().equals("Andres"))
                .findFirst().get().getPerson());

        assertTrue(bank.getAccounts().stream()
                .anyMatch(c -> c.getPerson().equals("John Doe")));

    }
}