package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task1 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Чётные и нечётные числа
     * Нулевое значение
     * Отрицательные числа
     */
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 10, 100})
    @DisplayName("Проверка четных чисел")
    public void checkPositiveNumberIsEven(int number) {
        boolean actualResult = methodProcessor.isEven(number);

        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 21, 101})
    @DisplayName("Проверка нечетных чисел")
    public void checkPositiveNumberIsOdd(int number) {
        boolean actualResult = methodProcessor.isEven(number);

        Assertions.assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -12, -120, -1340})
    @DisplayName("Проверка отрицательных четных чисел")
    public void checkNegativeNumberIsEven(int number) {
        boolean actualResult = methodProcessor.isEven(number);

        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -15, -123, -1347})
    @DisplayName("Проверка отрицательных нечетных чисел")
    public void checkNegativeNumberIsOdd(int number) {
        boolean actualResult = methodProcessor.isEven(number);

        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("Проверка нулевого значения")
    public void checkZeroNumber() {
        int number = 0;
        boolean actualResult = methodProcessor.isEven(number);

        Assertions.assertTrue(actualResult);
    }
}
