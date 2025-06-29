package complex_task.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest extends Service {
    private Task expectedTask;

    @BeforeEach
    public void createTask() {
        expectedTask = new Task<>(333, "New", "Low", LocalDate.now());
    }

    @Test
    @DisplayName("Добавление новой таски")
    public void testAddTaskValid() {
        int initialSize = service.getAll().size();
        service.add(expectedTask);

        Task actualTask = (Task) service.getAll().get(333);

        assertEquals(expectedTask, actualTask);
        assertEquals(1, initialSize + 1);
    }

    @Test
    @DisplayName("Ошибка добавления таски с существующем ID")
    public void testAddTaskInValidId() {
        int initialSize = service.getAll().size();
        Task expectedTask2 = new Task<>(333, "Progress", "Low", LocalDate.now());
        service.add(expectedTask);
        service.add(expectedTask2);

        assertEquals(1, initialSize + 1);
    }

    @Test
    @DisplayName("Ошибка добавления таски NULL")
    public void testAddTaskInValidTaskNull() {
        int initialSize = service.getAll().size();
        Task expectedTask2 = new Task(null, null, null, null);
        service.add(expectedTask2);

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Удаление таски")
    public void testRemoveTaskValid() {
        int initialSize = service.getAll().size();
        service.add(expectedTask);

        service.remove(expectedTask);

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Фильтрация тасок по статусу")
    public void testFilterByStatus() {
        Task expectedTask2 = new Task<>(4444, "Progress", "Low", LocalDate.now());
        service.add(expectedTask);
        service.add(expectedTask2);

        List<Task> taskList = (List<Task>) service.filterByStatus("Progress");
        Task actualTask = taskList.get(0);

        assertEquals(expectedTask2, actualTask);
    }

    @Test
    @DisplayName("Фильтрация тасок по приоритету")
    public void testFilterByPriority() {
        Task expectedTask2 = new Task<>(4444, "Progress", "Medium", LocalDate.now());
        service.add(expectedTask2);
        service.add(expectedTask);


        List<Task> taskList = (List<Task>) service.filterByPriority("Medium");
        Task actualTask = taskList.get(0);

        assertEquals(expectedTask2, actualTask);
    }

    @Test
    @DisplayName("Сортировка по Дате возрастания")
    public void testSortedByDateAsc() {
        Task expectedTask2 = new Task<>(4444, "Progress", "Low", LocalDate.of(2023, 6, 29));
        Task expectedTask3 = new Task<>(55555, "Progress", "Low", LocalDate.of(2024, 6, 29));
        service.add(expectedTask);
        service.add(expectedTask2);
        service.add(expectedTask3);

        List<Task> taskList = (List<Task>) service.sortedByDateAsc(LocalDate.now());

        assertEquals(4444, taskList.get(0));
        assertEquals(55555, taskList.get(2));
        assertEquals(333, taskList.get(1));
    }

    @Test
    @DisplayName("Сортировка по Дате убывания")
    public void testSortedByDateDesc() {
        Task expectedTask2 = new Task<>(4444, "Progress", "Low", LocalDate.of(2023, 6, 29));
        Task expectedTask3 = new Task<>(55555, "Progress", "Low", LocalDate.of(2024, 6, 29));
        service.add(expectedTask);
        service.add(expectedTask2);
        service.add(expectedTask3);

        List<Task> taskList = (List<Task>) service.sortedByDateAsc(LocalDate.now());

        assertEquals(333, taskList.get(0));
        assertEquals(55555, taskList.get(1));
        assertEquals(4444, taskList.get(2));
    }
}