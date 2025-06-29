package complex_task.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GradeServiceTest extends DoubleTest {

    @Test
    @DisplayName("Добавление нового предмета")
    public void testAddGradeInputValid() {
        int initialSize = gradeService.getGrades().size();
        StudentGrade<Double> expectedResult = new StudentGrade<>("Иван", "История", 4.5);

        gradeService.addGrade(expectedResult);

        Assertions.assertTrue(gradeService.getGrades().contains(expectedResult));

        StudentGrade<Double> actualResult = gradeService.getGrades().get(0);

        assertEquals(expectedResult, actualResult);

        assertEquals(1, initialSize + 1);
    }

    @Test
    @DisplayName("Ошибка добавление нового предмета - проверка исключения и сообщения в нем")
    public void testAddGradeInputInValid() {
        StudentGrade<Double> expectedStudentGrade = new StudentGrade<>("Иван", "История", -1.5);
        String expectedMessage = "Оценка не может быть меньше 0";
        String actualMessage = "";

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(expectedStudentGrade));

        try {
            gradeService.addGrade(expectedStudentGrade);
        } catch (InvalidGradeException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @Test
    @DisplayName("Расчет предмета с несколькими записями в листе")
    public void testCalcAvgGradeInputTwoSubject() {
        int initialSize = gradeService.getGrades().size();
        StudentGrade<Double> expectedResult1 = new StudentGrade<>("Иван", "История", 55.0);
        StudentGrade<Double> expectedResult2 = new StudentGrade<>("Сергей", "Русский язык", 80.0);
        StudentGrade<Double> expectedResult3 = new StudentGrade<>("Анна", "История", 85.0);
        StudentGrade<Double> expectedResult4 = new StudentGrade<>("Саша", "Химия", 74.5);

        gradeService.addGrade(expectedResult1);
        gradeService.addGrade(expectedResult2);
        gradeService.addGrade(expectedResult3);
        gradeService.addGrade(expectedResult4);

        double avg = gradeService.calcAvgGrade("История");

        assertEquals(70.0, avg);

        assertEquals(3, initialSize + 3);
    }

    @Test
    @DisplayName("Расчет предмета с одной записью в листе")
    public void testCalcAvgGradeInputOneSubject() {
        int initialSize = gradeService.getGrades().size();
        StudentGrade<Double> expectedResult1 = new StudentGrade<>("Иван", "История", 55.0);
        StudentGrade<Double> expectedResult2 = new StudentGrade<>("Сергей", "Русский язык", 80.0);
        StudentGrade<Double> expectedResult3 = new StudentGrade<>("Анна", "История", 85.0);
        StudentGrade<Double> expectedResult4 = new StudentGrade<>("Саша", "Химия", 74.5);

        gradeService.addGrade(expectedResult1);
        gradeService.addGrade(expectedResult2);
        gradeService.addGrade(expectedResult3);
        gradeService.addGrade(expectedResult4);

        double avg = gradeService.calcAvgGrade("Русский язык");

        assertEquals(80.0, avg);

        assertEquals(3, initialSize + 3);
    }
}