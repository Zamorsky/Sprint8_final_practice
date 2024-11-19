import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    @DisplayName("Проверяем корректное имя")
    public void testValidName() {
        // Проверяем корректное имя
        Account account = new Account("JohnDoe");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя меньше 3 символов")
    public void testNameTooShort() {
        // Проверяем имя меньше 3 символов
        Account account = new Account("Jo");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя больше 19 символов")
    public void testNameTooLong() {
        // Проверяем имя больше 19 символов
        Account account = new Account("Johnathan Edward Doe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя без пробела")

    public void testNameWithNoSpace() {
        // Проверяем имя без пробела
        Account account = new Account("JohnDoe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя с несколькими пробелами")
    public void testNameWithMultipleSpaces() {
        // Проверяем имя с несколькими пробелами
        Account account = new Account("John   Doe");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя, начинающееся с пробела")
    public void testNameStartsWithSpace() {
        // Проверяем имя, начинающееся с пробела
        Account account = new Account(" John");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя, заканчивающееся пробелом")
    public void testNameEndsWithSpace() {
        // Проверяем имя, заканчивающееся пробелом
        Account account = new Account("John ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверяем имя, равное null")
    public void testNameIsNull() {
        // Проверяем имя, равное null
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }
}
