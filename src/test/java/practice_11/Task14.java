package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Task14 extends MethodProcessorTest {
    /***
     * Тесты:
     * [1, 2, 3, 4, 5] → 3.0
     * [10] → 10.0
     * Пустой массив (должно выбрасываться исключение)
     */

    public static Stream<Arguments> providerInputArrayNumber() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[]{10}, 10.0)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputArrayNumber")
    @DisplayName("Проверка поиска среднего значения")
    public void testFindAverageInputIntArray(int[] array, double expectedResult) {
        double actualResult = methodProcessor.findAverage(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка выброса исключения при передачи пустого массива")
    public void testFindAverageInputIntIsEmptyArray() {
        Assertions.assertThrows(NoSuchElementException.class, () ->
                methodProcessor.findAverage(new int[0]));
    }
}
