package complex_task.task1;

import org.junit.jupiter.api.BeforeEach;

public class StudentTest {
    protected EntityManager<Student> manager;

    @BeforeEach
    public void beforeEach() {
        manager = new EntityManager<>();
    }
}
