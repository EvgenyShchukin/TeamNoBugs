package complex_task.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest extends Service {
    private static Movie expectedMovie;

    @BeforeAll
    public static void createMovie() {
        expectedMovie = new Movie("Боец", 2004, "Добров");
    }

    @Test
    @DisplayName("Добавление оценки по новому фильму")
    public void testAddRatingNewMovie() {
        Rating<Double> expectedRating = new Rating<>(7.0);

        service.addRating(expectedMovie, expectedRating);

        var stored = service.getAll().get(expectedMovie);

        Rating<Double> actualRating = (Rating<Double>) stored.get(0);

        assertSame(expectedRating, actualRating);

        assertEquals(1, stored.size());
    }

    @Test
    @DisplayName("Добавление оценки по существующему фильму")
    public void testAddRatingExistingMovie() {
        Rating<Double> expectedRating1 = new Rating<>(7.0);
        Rating<Double> expectedRating2 = new Rating<>(9.0);

        service.addRating(expectedMovie, expectedRating1);
        service.addRating(expectedMovie, expectedRating2);

        var stored = service.getAll().get(expectedMovie);

        Rating<Double> actualRating = (Rating<Double>) stored.get(1);

        assertSame(expectedRating2, actualRating);

        assertEquals(2, stored.size());
    }

    @ParameterizedTest
    @CsvSource({"0.9", "0.0", "-5", "10.1", "11"})
    @DisplayName("Ошибка добавления рейтинга невалидными значениями - выброс Exception и проверка сообщения")
    public void testAddRatingMovieInputInValid(double number) {
        String expectedMessage = "Оценка должна быть в диапазоне от 1 до 10";
        String actualMessage = "";
        assertThrows(InvalidRatingException.class, () ->
                service.addRating(expectedMovie, new Rating<>(number)));


        try {
            service.addRating(expectedMovie, new Rating<>(number));
        } catch (InvalidRatingException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @Test
    @DisplayName("Расчет среднего рейтинга по фильму без оценок")
    public void testCalcAvgRatingZeroDefault() {
        assertEquals(0.0, service.calcAvgRating(expectedMovie));
    }

    @Test
    @DisplayName("Расчет среднего рейтинга по фильму с оценками")
    public void testCalcAvgRatingInputValidNumber() {
        service.addRating(expectedMovie, new Rating<>(9));
        service.addRating(expectedMovie, new Rating<>(8.5));

        assertEquals(8.75, service.calcAvgRating(expectedMovie));
    }

    @Test
    @DisplayName("Сортировка фильмов")
    public void testSortedMovieByRating() {
        Movie newMovie = new Movie("Бригада", 2000, "Киселев");

        service.addRating(expectedMovie, new Rating<>(6.6));
        service.addRating(newMovie, new Rating<>(7.6));

        List<Movie> sorted = service.sortedMovieByRating();

        assertEquals(List.of(newMovie, expectedMovie), sorted);
    }

}