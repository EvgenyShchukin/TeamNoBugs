package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Task13 extends MethodProcessorTest {
    /***
     * Тесты:
     * "listen", "silent" → true
     * "java", "python" → false
     * null → false
     */

    public static Stream<Arguments> providerInputStringsTrue() {
        return Stream.of(
                Arguments.of("listen", "silent")
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStringsTrue")
    @DisplayName("Проверка строк на анограммность - True")
    public void testIsAnagramInputStringsTrue(String str1, String str2) {
        boolean actualResult = methodProcessor.isAnagram(str1, str2);
        Assertions.assertTrue(actualResult);
    }

    public static Stream<Arguments> providerInputStringsFalse() {
        return Stream.of(
                Arguments.of("java", "python"),
                Arguments.of(null, null),
                Arguments.of("test", null),
                Arguments.of(null, "test")
        );
    }

    @ParameterizedTest
    @MethodSource("providerInputStringsFalse")
    @DisplayName("Проверка строк на анограммность - False")
    public void testIsAnagramInputStringsFalse(String str1, String str2) {
        boolean actualResult = methodProcessor.isAnagram(str1, str2);
        Assertions.assertFalse(actualResult);
    }
}
