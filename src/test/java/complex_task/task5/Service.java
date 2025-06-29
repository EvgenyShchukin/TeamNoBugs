package complex_task.task5;

import org.junit.jupiter.api.BeforeEach;

public class Service {
    protected InventoryService service;

    @BeforeEach
    public void setup() {
        service = new InventoryService();
    }
}
