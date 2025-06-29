package complex_task.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerTest extends StudentTest {


    @Test
    @DisplayName("Проверка добавления элемента в пустой список")
    public void testEntityManagerAddEntityIsEmptyList() {
        int initialSize = manager.getAll().size();

        Student expectedResult = new Student("Петр", 21, true);

        manager.add(expectedResult);

        assertTrue(manager.getAll().contains(expectedResult));

        Student actualResult = manager.getAll().get(0);

        assertEquals(expectedResult, actualResult);

        assertEquals(1, initialSize + 1);
    }


    @Test
    @DisplayName("Проверка добавления элемента в непустой список")
    public void testEntityManagerAddEntityNotIsEmpty() {
        Student testStudent = new Student("Сеня", 22, true);

        manager.add(testStudent);

        int initialSize = manager.getAll().size();

        Student expectedResult = new Student("Петр", 21, true);

        manager.add(expectedResult);

        assertTrue(manager.getAll().contains(expectedResult));

        int indexOfExpectedResult = manager.getAll().indexOf(expectedResult);
        Student actualResult = manager.getAll().get(indexOfExpectedResult);

        assertEquals(expectedResult, actualResult);

        assertEquals(2, initialSize + 1);
    }

    @Test
    @DisplayName("Проверка удаления существующего элемента из списка")
    public void testEntityManagerRemoveEntityInList() {
        Student expectedResult = new Student("Петр", 21, true);

        manager.add(expectedResult);

        int initialSize = manager.getAll().size();

        boolean result = manager.remove(expectedResult);

        assertTrue(result);

        assertEquals(0, initialSize - 1);
    }

    @Test
    @DisplayName("Проверка удаления несуществующего элемента из списка")
    public void testEntityManagerRemoveDefunctEntityInList() {
        Student expectedResult = new Student("Петр", 21, true);

        int initialSize = manager.getAll().size();

        boolean result = manager.remove(expectedResult);

        assertFalse(result);

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Проверка получения всех элементов из списка")
    public void testEntityManagerGetAllEntitiesInList() {
        int initialSize = manager.getAll().size();

        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Петр", 21, true);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        assertTrue(manager.getAll().contains(expectedResult1));
        assertTrue(manager.getAll().contains(expectedResult2));

        Student actualResult1 = manager.getAll().get(0);
        Student actualResult2 = manager.getAll().get(1);

        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);

        assertEquals(2, initialSize + 2);
    }

    @Test
    @DisplayName("Проверка фильтрации по наименованию - элемент найден")
    public void testEntityManagerFilterNameFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        Student actualResult = manager.filterByName("Петр").get(0);

        assertEquals(expectedResult1, actualResult);
    }

    @Test
    @DisplayName("Проверка фильтрации по наименованию - элемент не найден")
    public void testEntityManagerFilterNameNotFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        boolean actualResult = manager.filterByName("Сергей").isEmpty();

        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Проверка фильтрации по возрасту - элемент найден")
    public void testEntityManagerFilterAgeFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        Student actualResult = manager.filterByAge(30, 35).get(0);

        assertEquals(expectedResult2, actualResult);
    }

    @Test
    @DisplayName("Проверка фильтрации по возрасту - элемент не найден")
    public void testEntityManagerFilterAgeNotFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        boolean actualResult = manager.filterByAge(40, 45).isEmpty();

        assertTrue(actualResult);
    }

    @Test
    @DisplayName("Проверка фильтрации по активности - элемент найден")
    public void testEntityManagerFilterActiveFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, true);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        Student actualResult = manager.filterByActive(true).get(0);

        assertEquals(expectedResult1, actualResult);
    }

    @Test
    @DisplayName("Проверка фильтрации по активности - элемент не найден")
    public void testEntityManagerFilterActiveNotFoundEntityInList() {
        Student expectedResult1 = new Student("Петр", 21, false);
        Student expectedResult2 = new Student("Иван", 32, false);

        manager.add(expectedResult1);
        manager.add(expectedResult2);

        boolean actualResult = manager.filterByActive(true).isEmpty();

        assertTrue(actualResult);
    }
}
