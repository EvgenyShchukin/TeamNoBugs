package complex_task.task4;

import org.junit.jupiter.api.BeforeEach;

public class Service {
    protected MovieService service;

    @BeforeEach
    public void setup() {
        service = new MovieService();
    }
}
