package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task20 extends MethodProcessorTest {
    /**
     * [1, 2, 3, 4, 5] → false
     * [1, 2, 2, 3] → true
     * Пустой массив → false
     */

    public static Stream<Arguments> providerInputIntegerArraysNotDuplicate() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{}));
    }

    @ParameterizedTest
    @MethodSource("providerInputIntegerArraysNotDuplicate")
    @DisplayName("Проверка на отсутствие дубликатов")
    public void testHasDuplicatesInputIntNotDuplicate(int[] numbers) {
        boolean actualResult = methodProcessor.hasDuplicates(numbers);

        Assertions.assertFalse(actualResult);
    }

    public static Stream<Arguments> providerInputIntegerArraysDuplicate() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3}),
                Arguments.of(new int[]{-2, 2, -11, -2}));
    }

    @ParameterizedTest
    @MethodSource("providerInputIntegerArraysDuplicate")
    @DisplayName("Проверка на наличие дубликатов")
    public void testHasDuplicatesInputIntDuplicate(int[] numbers) {
        boolean actualResult = methodProcessor.hasDuplicates(numbers);

        Assertions.assertTrue(actualResult);
    }
}
