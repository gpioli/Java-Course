package org.piolig.junit5app.examples.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.piolig.junit5app.examples.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    @BeforeEach
    void initMethodTest() {
        account = new Account("Gaston", new BigDecimal("1000.12345"));
        System.out.println("Initializing method.");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Finishing test method");
    }

    // i.e.: used to initialize resources
    @BeforeAll
    static void beforeAll() {
        System.out.println("Initializing test");
    }

    // i.e.: used to close a resource
    @AfterAll
    static void afterAll() {
        System.out.println("Finishing test");
    }

    @Test
    @DisplayName("Testing account name field")
    void testAccountName() {

        account.setPerson("Gaston");

        String expected = "Gaston";
        String real = account.getPerson();
        assertNotNull(real, "Account can't be null");

        assertEquals(expected, real, "Incorrect name account: expected: " + expected +
                " actual: " + real);
        // using lambdas help us save resources, as the string object isn't instantiated unless
        // the assert condition isn't fulfilled
        assertTrue(real.equals("Gaston"), () -> "The account name differs from the expected");
    }

    @Test
    @DisplayName("Testing Account balance: not null, greater than cero, expected value")
    void testAccountBalance() {
        assertNotNull(account.getBalance());
        assertEquals(1000.12345, account.getBalance().doubleValue());
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }

    // different objects
    @Test
    @DisplayName("Testing account references")
    void testAccountReference() {
        account = new Account("John Doe", new BigDecimal(89000.9997));
        Account account2 = new Account("John Doe", new BigDecimal(89000.9997));

        //assertNotEquals(account2, account);
        assertEquals(account2, account);
    }

    @Test
    void testAccountDebit() {
        account.debit(new BigDecimal(100));
        assertNotNull(account.getBalance());
        assertEquals(900, account.getBalance().intValue());
        assertEquals("900.12345", account.getBalance().toPlainString());

    }

    @Test
    void testAccountCredit() {
        account.credit(new BigDecimal(100));
        assertNotNull(account.getBalance());
        assertEquals(1100, account.getBalance().intValue());
        assertEquals("1100.12345", account.getBalance().toPlainString());
    }

    @Test
    void insufficientBalanceExceptionAccount() {
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.debit(new BigDecimal(1500));
        });

        String actual = exception.getMessage();
        String expected = "Insufficient balance for the transaction.";

        assertEquals(expected, actual);
    }

    @Test
    void testTransference() {
        account = new Account("John Doe", new BigDecimal(2500));
        Account account2 = new Account("Andres", new BigDecimal("1500.8989"));

        Bank bank = new Bank();
        bank.setName("State Bank");
        bank.transference(account2, account, new BigDecimal(500));

        assertEquals("1000.8989", account2.getBalance().toPlainString());
        assertEquals("3000", account.getBalance().toPlainString());
    }

    @Test
    @DisplayName("Testing relationships between the bank account and the bank with assertAll")
    void testBankAccountsRelationship() {
        // with this method, we ensure that the test fails
        Account account = new Account("John Doe", new BigDecimal(2500));
        Account account2 = new Account("Andres", new BigDecimal("1500.8989"));

        Bank bank = new Bank();
        bank.addAccount(account);
        bank.addAccount(account2);
        bank.setName("State Bank");
        bank.transference(account2, account, new BigDecimal(500));

        assertAll(() -> {
                    assertEquals("1000.8989", account2.getBalance().toPlainString());
                }, () -> {
                    assertEquals("3000", account.getBalance().toPlainString(), () -> "Account balance differs" +
                            "from the expected one)");
                    // this lambdas can be simplified, as they are one-liners:
                }, () -> assertEquals(2, bank.getAccounts().size()),
                () -> assertEquals("State Bank", account.getBank().getName()),
                () -> assertEquals("Andres", bank.getAccounts().stream()
                        .filter(c -> c.getPerson().equals("Andres"))
                        .findFirst().get().getPerson()),
                () -> assertTrue(bank.getAccounts().stream()
                        .anyMatch(c -> c.getPerson().equals("John Doe"))));

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnlyWindows() {
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void testOnlyLinuxMac() {
    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testNoWindows() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testOnlyJdk8() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testOnlyJDK11() {
    }

    @Test
    @DisabledOnJre(JRE.JAVA_15)
    void testNoJDK15() {
    }

    // Prints system properties...
    @Test
    void systemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    // Another way of testing according to java version
    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "11")
    void testJavaVersion() {
    }

    @Test
    @DisabledIfSystemProperty(named= "os.arch", matches = ".*32.*")
    void testOnly64() {
    }

    @Test
    @EnabledIfSystemProperty(named= "os.arch", matches = ".*32.*")
    void testNo64() {
    }

    @Test
    @EnabledIfSystemProperty(named= "user.name", matches = "milton")
    void testUserName() {
    }

    @Test
    @EnabledIfSystemProperty(named = "ENV", matches = "dev")
    void testDev() {
    }

    @Test
    void testPrintEnvironmentVars() {
        Map<String, String> getEnv = System.getenv();
        getEnv.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "HOME", matches = "/home/milton")
    void testHome() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PAPERSIZE", matches = "a4")
    void testProcessors() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
    void testEnv() {
    }
}