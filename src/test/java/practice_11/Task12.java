package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Task12 extends MethodProcessorTest {
    /***
     * Тесты:
     * [ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
     * Одинаковые длины ([ "aa", "bb", "cc" ])
     * Пустой список
     */

    public static Stream<Arguments> providerInputStringsList() {
        return Stream.of(
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStringsList")
    @DisplayName("Проверка сортировки по длине строки")
    public void testSortByLengthInputListStrings(List<String> words, List<String> expectedResult) {
        Assertions.assertEquals(expectedResult, methodProcessor.sortByLength(words));
    }
}
