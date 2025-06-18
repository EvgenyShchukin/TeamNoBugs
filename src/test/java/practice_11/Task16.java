package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task16 extends MethodProcessorTest {
    /***
     * Тесты:
     * "Java,Python,C++", "," → ["Java", "Python", "C++"]
     * "", "," → [""]
     * "word", "," → ["word"]
     */

    public static Stream<Arguments> providerInputString() {
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"})
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputString")
    @DisplayName("Проверка разбиения строки по разделителю")
    public void testSplitStringInputArrayStrings(String input, String delimiter, String[] expectedResult) {
        Assertions.assertArrayEquals(expectedResult, methodProcessor.splitString(input, delimiter));
    }
}
