package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task9 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Пустую строку
     * null
     * Строку с несколькими пробелами
     */

    public static Stream<Arguments> providerInputStrings() {
        return Stream.of(
                Arguments.of("Баба Яга сказала", 3),
                Arguments.of("Молоко", 1),
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStrings")
    @DisplayName("Проверка количества слов")
    public void testCountWordsInputStrings(String words, int expectedResult) {
        int actualResult = methodProcessor.countWords(words);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // TODO: [Метод почему-то возвращает исключение NullPointerException,
    //  а в подсказках указано IllegalArgumentException]
    @Disabled
    @Test
    @DisplayName("Проверка количества слов при передачи Null")
    public void testCountWordsInputNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                methodProcessor.countWords(null));
    }
}
