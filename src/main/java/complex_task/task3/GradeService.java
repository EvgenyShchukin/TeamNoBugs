package complex_task.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade() < 0) {
            throw new InvalidGradeException("Оценка не может быть меньше 0");
        }

        grades.add(grade);
    }

    public synchronized double calcAvgGrade(String subject) {
        double sum = 0;
        List<T> subjectGrades = (List<T>) grades.stream()
                .filter(g -> g.getSubject().equalsIgnoreCase(subject))
                .map(StudentGrade::getGrade)
                .collect(Collectors.toList());

        if (subjectGrades.isEmpty()) {
            return 0.0;
        }

        for (T grade : subjectGrades) {
            sum += grade.doubleValue();
        }

        return sum / subjectGrades.size();
    }

    public synchronized List<StudentGrade<T>> getGrades() {
        return new ArrayList<>(grades);
    }
}
