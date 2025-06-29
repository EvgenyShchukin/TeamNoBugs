package complex_task.task6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task<T> {
    private T id;
    private String status;
    private String priority;
    private final LocalDate date;

    public Task(T id, String status, String priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;

        Task<T> task = (Task<T>) o;

        return Objects.equals(this.id, task.id) &&
                Objects.equals(this.status, task.status) &&
                Objects.equals(this.priority, task.priority) &&
                Objects.equals(this.date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, priority, date);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", date=" + date +
                '}';
    }
}
