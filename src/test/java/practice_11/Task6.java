package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task6 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
     * null
     */

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com",
            "test.test@example.com",
            "test-test@example.com",
            "t123@123example.com",
            "test@e.com",
            "test@example-ya.com",
            "test@example.ya.com",
            "test@example.ru",
            "test@example.comstartfinish"})
    @DisplayName("Проверка валидных значений")
    public void testIsValidEmailInputValidEmail(String email) {
        boolean actualResult = methodProcessor.isValidEmail(email);

        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@example.com",
            "test,test@example.com",
            "bad@.com",
            "test@example,ya.com",
            "no-at-symbol",
            "test@example.r",
            "test@example."})
    @DisplayName("Проверка невалидных значений")
    public void testIsValidEmailInputNotValidEmail(String email) {
        boolean actualResult = methodProcessor.isValidEmail(email);

        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("Проверка передачи Null")
    public void testIsValidEmailInputNullEmail() {
        boolean actualResult = methodProcessor.isValidEmail(null);

        Assertions.assertFalse(actualResult);
    }
}
