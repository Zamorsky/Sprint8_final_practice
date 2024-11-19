import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testValidName() {
        // Проверяем корректное имя
        Account account = new Account("John Doe");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooShort() {
        // Проверяем имя меньше 3 символов
        Account account = new Account("Jo");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooLong() {
        // Проверяем имя больше 19 символов
        Account account = new Account("Johnathan Edward Doe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithNoSpace() {
        // Проверяем имя без пробела
        Account account = new Account("JohnDoe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithMultipleSpaces() {
        // Проверяем имя с несколькими пробелами
        Account account = new Account("John   Doe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameStartsWithSpace() {
        // Проверяем имя, начинающееся с пробела
        Account account = new Account(" John");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameEndsWithSpace() {
        // Проверяем имя, заканчивающееся пробелом
        Account account = new Account("John ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameIsNull() {
        // Проверяем имя, равное null
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }
}
