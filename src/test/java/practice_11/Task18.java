package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task18 extends MethodProcessorTest {
    /***
     * Тесты:
     * 24, 36 → 12
     * 101, 103 → 1
     * 0, 10 → 10
     */

    public static Stream<Arguments> providerInputInteger() {
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputInteger")
    @DisplayName("Проверка нахождения наибольшего общего делителя")
    public void testGcdInputInteger(int a, int b, int expectedResult) {
        int actualResult = methodProcessor.gcd(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
