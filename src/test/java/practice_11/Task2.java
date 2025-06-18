package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Разные строки ("hello", "java", "AEIOU", "")
     * null (должно выбрасываться исключение)
     * Строки без гласных
     */

    public static Stream<Arguments> providerStringForCountVowelsPositiveCases() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5)
                );
    }

    @ParameterizedTest
    @MethodSource("providerStringForCountVowelsPositiveCases")
    @DisplayName("Проверка значений с гласными буквами")
    public void testCountVowelsPositive(String input, int countVowel) {
        int expectedResult = methodProcessor.countVowels(input);

        Assertions.assertEquals(countVowel, expectedResult);
    }

    public static Stream<Arguments> providerStringForCountVowelsNegativeCases() {
        return Stream.of(
                Arguments.of("bcd", 0),
                Arguments.of("t", 0),
                Arguments.of("", 0),
                Arguments.of("3", 0),
                Arguments.of("&", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("providerStringForCountVowelsNegativeCases")
    @DisplayName("Проверка значений без гласных букв")
    public void testCountVowelsNegative(String input, int countVowel) {
        int expectedResult = methodProcessor.countVowels(input);

        Assertions.assertEquals(countVowel, expectedResult);
    }

    @Test
    @DisplayName("Проверка на Null")
    public void testCountVowelsCannotIfNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodProcessor.countVowels(null);
        }, "Отсутствует значение в переданной строке");
    }
}
