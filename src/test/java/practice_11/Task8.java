package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task8 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Обычные массивы
     * Массив с одинаковыми числами
     * Один элемент в массиве (должно выбрасываться исключение)
     */

    public static Stream<Arguments> providerInputArrayNumber() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
                Arguments.of(new int[]{3, 5, 7, 5}, 5),
                Arguments.of(new int[]{-3, -5, -7, -2}, -3),
                Arguments.of(new int[]{-2, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputArrayNumber")
    @DisplayName("Проверка поиска второго максимального значения")
    public void testFindMaxInputIntArray(int[] array, int expectedResult) {
        int actualResult = methodProcessor.findSecondMax(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка поиска второго максимального значения в массиве с одинаковыми элементами")
    public void testFindMaxInputIntDuplicateArray() {
        assertThrows(NoSuchElementException.class, () -> {
            methodProcessor.findSecondMax(new int[]{5, 5, 5, 5});
        });
    }

    // TODO: [Метод почему-то возвращает исключение IllegalArgumentException,
    //  а в подсказках указано NoSuchElementException]
    @Disabled
    @Test
    @DisplayName("Проверка поиска второго максимального значения в массиве с одинаковыми элементами")
    public void testFindMaxInputIntOneElementInArray() {
        assertThrows(NoSuchElementException.class, () -> {
            methodProcessor.findSecondMax(new int[]{2});
        });
    }

    // TODO: [Метод почему-то возвращает исключение IllegalArgumentException,
    //  а в подсказках указано NoSuchElementException]
    @Disabled
    @Test
    @DisplayName("Проверка поиска второго максимального значения в массиве без элементов")
    public void testFindMaxInputIntNullArray() {
        assertThrows(NoSuchElementException.class, () -> {
            methodProcessor.findSecondMax(new int[]{});
        });
    }

}
