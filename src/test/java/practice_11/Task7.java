package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task7 extends MethodProcessorTest {
    /**
     * Тесты должны проверять:
     * 0! = 1
     * Маленькие числа (1!, 5!, 7!)
     * Отрицательные числа (должно выбрасываться исключение)
     */

    public static Stream<Arguments> providerInputValidNumber() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputValidNumber")
    @DisplayName("Проверка валидных значений")
    public void testFactorialInputIntValid(int number, int expectedResult) {
        int actualResult = methodProcessor.factorial(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка расчета факториала 0 значения")
    public void testFactorialInputZero() {
        int actualResult = methodProcessor.factorial(0);

        Assertions.assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("Проверка выбрасывания исключения при отрицательном значении")
    public void testFactorialInputIntNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            methodProcessor.factorial(-5);
        });
    }
}
