package org.piolig.junit5app.examples.models;

import org.piolig.junit5app.examples.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;

public class Account {
    private String person;
    private BigDecimal balance;
    private Bank bank;

    public Account(String person, BigDecimal balance) {
        this.person = person;
        this.balance = balance;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void debit(BigDecimal ammount) {
        // BigDecimal is immutable, so we must reassign
        BigDecimal newBalance = this.balance.subtract(ammount);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new InsufficientBalanceException("Insufficient balance for the transaction.");
        }
        this.balance = newBalance;
    }

    public void credit(BigDecimal ammount) {
        this.balance = this.balance.add(ammount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Account)) {
            return false;
        }
        Account c = (Account) obj;
        if (this.person == null || this.balance == null) {
            return false;
        }
        return this.person.equals(c.getPerson()) && this.balance.equals(c.getBalance());
    }
}
