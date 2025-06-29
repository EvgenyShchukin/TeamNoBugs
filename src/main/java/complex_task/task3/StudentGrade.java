package complex_task.task3;

import complex_task.task1.Entity;

import java.util.Objects;

public class StudentGrade<T extends Number> {
    private final String name;
    private final String subject;
    private final double grade;

    public StudentGrade(String name, String subject, double grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;

        StudentGrade<?> that = (StudentGrade<?>) o;
        return Double.compare(grade, that.grade) == 0 && Objects.equals(name, that.name) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subject, grade);
    }
}
