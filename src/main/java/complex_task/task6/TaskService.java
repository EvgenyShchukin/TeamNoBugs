package complex_task.task6;

import complex_task.task5.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService<T> {

    private final Map<T, Task<T>> tasks = Collections.synchronizedMap(new HashMap<>());

    public synchronized void add(Task<T> task) {
        if (task == null) {
            System.out.println("Ошибка: Передан пустой объект task");
        } else if (tasks.containsKey(task.getId())) {
            System.out.println("Ошибка: task с данным ID уже присутствует");
        } else {
            tasks.put(task.getId(), task);
        }
    }

    public synchronized void remove(T id) {
        tasks.remove(id);
    }

    public List<Task<T>> filterByStatus(String status) {
        return tasks.values().stream().filter(s -> s.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> filterByPriority(String priority) {
        return tasks.values().stream().filter(p -> p.getPriority().equals(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortedByDateAsc(LocalDate date) {
        return tasks.values().stream()
                .filter(d -> !d.getDate().equals(date))
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortedByDateDesc(LocalDate date) {
        return tasks.values().stream()
                .filter(task -> !task.getDate().equals(date))
                .sorted(Comparator.comparing((Task<T> task) -> task.getDate()).reversed())
                .collect(Collectors.toList());
    }

    public Map<T, Task<T>> getAll() {
        return tasks;
    }
}
