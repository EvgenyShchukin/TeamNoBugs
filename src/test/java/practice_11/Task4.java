package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Task4 extends MethodProcessorTest {
    /***
     * Обычный массив ([3, 5, 7, 2])
     * Один элемент в массиве
     * Отрицательные числа
     * Пустой массив (должно выбрасываться исключение)
     */

    public static Stream<Arguments> providerInputArrayNumber() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputArrayNumber")
    @DisplayName("Проверка поиска максимального значения")
    public void testFindMaxInputIntArray(int[] array, int expectedResult) {
        int actualResult = methodProcessor.findMax(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка выброса исключения при поиске в пустом массиве")
    public void testFindMaxInputIsEmptyArray() {
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            methodProcessor.findMax(new int[0]);
        });
    }

    @Test
    @DisplayName("Проверка выброса исключения при отсутствии массива")
    public void testFindMaxInputNullArray() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            methodProcessor.findMax(null);
        });
    }
}
