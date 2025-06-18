package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Task15 extends MethodProcessorTest {
    /***
     * Тесты:
     * [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
     * Пустой список
     */

    public static Stream<Arguments> providerInputStrings() {
        return Stream.of(
                Arguments.of(List.of("Java", "C++", "Go"), List.of(4, 3, 2)),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStrings")
    @DisplayName("Проверка преобразования строк в их длины")
    public void testMapToLengthsInputStrings(List<String> words, List<Integer> expectedResult) {
        Assertions.assertEquals(expectedResult, methodProcessor.mapToLengths(words));
    }
}
