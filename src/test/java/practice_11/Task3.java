package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task3 extends MethodProcessorTest {

    /***
     * Тесты должны проверять:
     * Обычные строки
     * Пустую строку
     * null (должно возвращаться null)
     */

    public static Stream<Arguments> providerInputStringPositiveCases() {
        return Stream.of(
                Arguments.of("anna", "anna"),
                Arguments.of("egor", "roge"),
                Arguments.of("navigator", "rotagivan"),
                Arguments.of("томск", "ксмот"),
                Arguments.of("u", "u"),
                Arguments.of("", ""),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStringPositiveCases")
    @DisplayName("Проверка валидных значений")
    public void testReverseInputStringValidCases(String input, String expectedResult) {
        String actualResult = methodProcessor.reverse(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

