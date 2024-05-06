package org.piolig.junit5app.examples.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.piolig.junit5app.examples.exceptions.InsufficientBalanceException;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AccountTest {

    Account account;

    private TestInfo testInfo;
    private TestReporter testReporter;

    @BeforeEach
    void initMethodTest(TestInfo testInfo, TestReporter testReporter) {
        account = new Account("Gaston", new BigDecimal("1000.12345"));
        System.out.println("Initializing method.");
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Executing: " + testInfo.getDisplayName() + " " + testInfo.getTestMethod().orElse(null).getName()
                + " with tags: " + testInfo.getTags());
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

    @Tag("account")
    @Nested
    @DisplayName("Testing account attributes.")
    class AccountNameAndBalanceTest {

        @Test
        @DisplayName("Testing name field")
        void testAccountName() {
            testReporter.publishEntry(testInfo.getTags().toString());
            if (testInfo.getTags().contains("account")) {
                System.out.println("Do something with account tag");
            }

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
        @DisplayName("Testing balance: not null, greater than cero, expected value")
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

    }

    @Nested
    class AccountOperationsTest {

        @Tag("account")
        @Test
        void testAccountDebit() {
            account.debit(new BigDecimal(100));
            assertNotNull(account.getBalance());
            assertEquals(900, account.getBalance().intValue());
            assertEquals("900.12345", account.getBalance().toPlainString());

        }

        @Tag("account")
        @Test
        void testAccountCredit() {
            account.credit(new BigDecimal(100));
            assertNotNull(account.getBalance());
            assertEquals(1100, account.getBalance().intValue());
            assertEquals("1100.12345", account.getBalance().toPlainString());
        }

        @Tag("account")
        @Tag("bank")
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

    }

    @Tag("account")
    @Tag("error")
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

    @Nested
    class OperativeSystemTest {
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

    }

    @Nested
    class JavaVersionTest {
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

    }

    @Nested
    class SystemPropertiesTest {

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

    }

    class EnvironmentVariablesTest {

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

    @Test
    @DisplayName("Testing Account balance: not null, greater than cero, expected value" +
            "in dev environment.")
    void testAccountBalanceDev() {
        boolean isDev = "dev".equals(System.getProperty("ENV"));

        //
        assumeTrue(isDev);
        assertNotNull(account.getBalance());
        assertEquals(1000.12345, account.getBalance().doubleValue());
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @DisplayName("Testing Account balance: not null, greater than cero, expected value" +
            "in dev environment - test 2.")
    void testAccountBalanceDev2() {
        boolean isDev = "dev".equals(System.getProperty("ENV"));

        // this code wont run in case environment != dev
        assumingThat(isDev, ()-> {
            assertNotNull(account.getBalance());
            assertEquals(1000.12345, account.getBalance().doubleValue());
        });
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);

    }

    @DisplayName("Testing account debit with repetitions")
    @RepeatedTest(value = 5, name = "{displayName} - Repetition number: {currentRepetition} of {totalRepetitions}")
    void testAccountDebitRepeated(RepetitionInfo repetitionInfo) {
        if (repetitionInfo.getCurrentRepetition() == 3) {
            System.out.println("We are in the third repetition!");
        }
        account.debit(new BigDecimal(100));
        assertNotNull(account.getBalance());
        assertEquals(900, account.getBalance().intValue());
        assertEquals("900.12345", account.getBalance().toPlainString());

    }


    @Tag("param")
    @Nested
    class ParametrizedTests {
        @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
        @ValueSource(strings = {"100", "200", "300", "500", "700", "1000"})
        void testAccountValueSource(String amount) {

            account.debit(new BigDecimal(amount));
            assertNotNull(account.getBalance());
            assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
        }

        @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
        @CsvSource({"1,100", "2,200", "3,300", "4,500", "5,700", "6,1000"})
        void testAccountDebitCsvSource(String index, String amount) {
            System.out.println(index + " -> " + amount);
            account.debit(new BigDecimal(amount));
            assertNotNull(account.getBalance());
            assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
        }

        @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
        @CsvFileSource(resources = "/data.csv")
        void testAccountDebitCsvFileSource(String amount) {
            account.debit(new BigDecimal(amount));
            assertNotNull(account.getBalance());
            assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
        }

        @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
        @CsvSource({"200,100, John, Andres", "250,200, Pepe, Pepe", "300,300, Maria, maria", "510,500, Pepa, Pepe", "750,700, Lucas, Luca", "1000.12345,1000.12345, Cata, Cata"})
        void testAccountDebitCsvSource2(String balance, String amount, String expected, String actual) {
            System.out.println(balance + " -> " + amount);
            account.setBalance(new BigDecimal(balance));
            account.debit(new BigDecimal(amount));
            account.setPerson(actual);


            assertNotNull(account.getBalance());
            assertNotNull(account.getPerson());
            assertEquals(expected, actual);
            assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
        }

        @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
        @CsvFileSource(resources = "/data2.csv")
        void testAccountDebitCsvFileSource2(String balance, String amount, String expected, String actual) {
            System.out.println(balance + " -> " + amount);
            account.setBalance(new BigDecimal(balance));
            account.debit(new BigDecimal(amount));
            account.setPerson(actual);


            assertNotNull(account.getBalance());
            assertNotNull(account.getPerson());
            assertEquals(expected, actual);
            assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
        }
    }

    @Tag("param")
    @ParameterizedTest(name = "Repetition number {index}. Executing with value: {0} - {argumentsWithNames}")
    @MethodSource("amountList")
    void testAccountDebitMethodSource(String amount) {
        account.debit(new BigDecimal(amount));
        assertNotNull(account.getBalance());
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) >= 0);
    }

    static List<String> amountList(){
        return Arrays.asList("100", "200", "300", "500", "700", "1000");
    }

    @Nested
    @Tag("Timeout")
    class exampleTimeOutTest {
        @Test
        @Timeout(1)
        void testTimeOut() throws InterruptedException {
            TimeUnit.MILLISECONDS.sleep(100);
        }

        @Test
        @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
        void testTimeOut2() throws InterruptedException {
            TimeUnit.MILLISECONDS.sleep(900);
        }

        @Test
        void testTimeOut3() {
            assertTimeout(Duration.ofSeconds(5), () -> {
                TimeUnit.MILLISECONDS.sleep(4000);
            });
        }
    }


}