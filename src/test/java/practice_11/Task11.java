package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;


public class Task11 extends MethodProcessorTest {
    /***
     * Тесты:
     * Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
     * Список без чётных чисел
     * Пустой список
     */


    public static Stream<Arguments> providerInputListNumber() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                Arguments.of(List.of(1, 3, 5), List.of()),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputListNumber")
    @DisplayName("Проверка фильтрации по четным числам")
    public void testFilterEvenNumbersInputList(List<Integer> numbers, List<Integer> expectedResult) {

        Assertions.assertEquals(expectedResult, methodProcessor.filterEvenNumbers(numbers));
    }
}
