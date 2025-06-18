package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task17 extends MethodProcessorTest {
    /***
     * Тесты:
     * "Password1" → true
     * "pass" → false
     * null → false
     */

    @Test
    @DisplayName("Успешная проверка пароля")
    public void testIsValidPasswordInputStringValid() {
        boolean actualResult = methodProcessor.isValidPassword("Password1");

        Assertions.assertTrue(actualResult);
    }

    @Test
    @DisplayName("Ошибка проверки пароля")
    public void testIsValidPasswordInputStringInvalid() {
        boolean actualResult = methodProcessor.isValidPassword("pass");

        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("Ошибка проверки пароля - передано Null")
    public void testIsValidPasswordInputStringNull() {
        boolean actualResult = methodProcessor.isValidPassword(null);

        Assertions.assertFalse(actualResult);
    }
}
