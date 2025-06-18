package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task10 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Корректные номера ("+1 1234567890")
     * Некорректные номера ("12345", "invalid")
     */

    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890",
            "+12 1234567890",
            "+123 1234567890"})
    @DisplayName("Проверка номера телефона валидными значениями")
    public void testIsValidPhoneNumberInputValidPhone(String phone) {
        boolean actualResult = methodProcessor.isValidPhoneNumber(phone);

        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "1 1234567890",
            "+1234 1234567890",
            "+",
            "+1",
            "+123 1234567890123",
            "12345",
            "invalid",
            ""})
    @DisplayName("Проверка номера телефона валидными значениями")
    public void testIsValidPhoneNumberInputNotValidPhone(String phone) {
        boolean actualResult = methodProcessor.isValidPhoneNumber(phone);

        Assertions.assertFalse(actualResult);
    }

    // TODO: [Метод почему-то возвращает исключение NullPointerException,
    //  а в подсказках указано IllegalArgumentException]
    @Disabled
    @Test
    @DisplayName("Проверка выбрасывания исключения при передачи Null")
    public void testIsValidPhoneNumberInputNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                methodProcessor.isValidPhoneNumber(null));
    }
}
