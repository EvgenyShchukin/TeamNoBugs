package complex_task.task3;

import org.junit.jupiter.api.BeforeEach;

public class DoubleTest extends Number{
    protected GradeService<Double> gradeService;

    @BeforeEach
    public void setup() {
        gradeService = new GradeService<>();
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
