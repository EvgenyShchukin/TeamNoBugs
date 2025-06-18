package practice_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task5 extends MethodProcessorTest {
    /***
     * Тесты должны проверять:
     * Обычные годы
     * Високосные (2020, 2000, 1600)
     * Года, которые делятся на 100, но не на 400 (1900, 2100)
     */

    @ParameterizedTest
    @ValueSource(ints = {2021, 2013, 2023})
    @DisplayName("Проверка обычных годов")
    public void testIsNotLeapYearInputYears(int year) {
        boolean actualResult = methodProcessor.isLeapYear(year);

        Assertions.assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    @DisplayName("Проверка високосных годов")
    public void testIsLeapYearInputYears(int year) {
        boolean actualResult = methodProcessor.isLeapYear(year);

        Assertions.assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    @DisplayName("Проверка високосных годов")
    public void testIsLeapYearInputYearsSort(int year) {
        boolean actualResult = methodProcessor.isLeapYear(year);

        Assertions.assertFalse(actualResult);
    }
}
