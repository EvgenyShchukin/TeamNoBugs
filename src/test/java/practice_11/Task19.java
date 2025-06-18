package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task19 extends MethodProcessorTest {
    /***
     * Тесты:
     * "{"key":"value"}" → true
     * "invalid json" → false
     * null → false
     */

    @Test
    @DisplayName("Проверка JSON успешно пройдена")
    public void testIsValidJsonInputValidTrue() {
        String json = "{\"key\":\"value\"}";
        boolean actualResult = methodProcessor.isValidJson(json);
        Assertions.assertTrue(actualResult);
    }

    @Test
    @DisplayName("Проверка JSON не пройдена - не JSON")
    public void testIsValidJsonInputInvalidFalse() {
        String json = "invalid json";
        boolean actualResult = methodProcessor.isValidJson(json);
        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("Проверка JSON не пройдена - null")
    public void testIsValidJsonInputNullFalse() {
        boolean actualResult = methodProcessor.isValidJson(null);
        Assertions.assertFalse(actualResult);
    }
}
