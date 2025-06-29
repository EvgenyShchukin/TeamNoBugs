package complex_task.task6;

import org.junit.jupiter.api.BeforeEach;

public class Service {
    protected TaskService service;

    @BeforeEach
    public void setup() {
        service = new TaskService();
    }
}
