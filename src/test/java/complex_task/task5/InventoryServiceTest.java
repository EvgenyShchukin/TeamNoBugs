package complex_task.task5;

import complex_task.task4.InvalidRatingException;
import complex_task.task4.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest extends Service {

    @BeforeAll
    public static void createProduct() {
        Product product1 = new Product("Молоко", 65, "Молочка");
        Product product2 = new Product("Яблоки", 135, "Фрукты");
    }

    @Test
    @DisplayName("Добавление товара в новой категории")
    public void testAddProductNewCategory() {
        int initialSize = service.getAll().size();
        Product expectedProduct = new Product("Молоко", 65, "Молочка");
        service.setIsInventoryOpen(true);

        service.add(expectedProduct);

        Product actualProduct = service.getAll().get("Молочка").get(0);

        assertEquals(expectedProduct, actualProduct);
        assertEquals(1, initialSize + 1);
    }

    @Test
    @DisplayName("Добавление товара в существующую категории")
    public void testAddProductInExistingCategory() {
        int initialSize = service.getAll().size();
        Product expectedProduct1 = new Product("Молоко", 65, "Молочка");
        Product expectedProduct2 = new Product("Сметана", 70, "Молочка");
        service.setIsInventoryOpen(true);

        service.add(expectedProduct1);
        service.add(expectedProduct2);

        Product actualProduct = service.getAll().get("Молочка").get(1);

        assertEquals(expectedProduct2, actualProduct);
        assertEquals(2, initialSize + 2);
    }

    @Test
    @DisplayName("Ошибка добавления товара из-за флага")
    public void testAddProductIsInventoryOpenFalse() {
        int initialSize = service.getAll().size();
        Product expectedProduct1 = new Product("Молоко", 65, "Молочка");
        service.setIsInventoryOpen(false);

        service.add(expectedProduct1);

        assertEquals(0, initialSize);
    }

    @Test
    @DisplayName("Извлечение товара по категории")
    public void testGetProductCategoryValid() {
        Product expectedProduct1 = new Product("Молоко", 65, "Молочка");
        Product expectedProduct2 = new Product("Сметана", 70, "Молочка");
        service.setIsInventoryOpen(true);

        service.add(expectedProduct1);
        service.add(expectedProduct2);

        Product actualProduct = service.getProducts("Молочка");

        assertEquals(expectedProduct1, actualProduct, "Должен вернуться первый добавленный товар");
        assertEquals(List.of(expectedProduct2), service.getAll().get("Молочка"));
    }

    @Test
    @DisplayName("Ошибка извлечения товара - список пустой")
    public void testGetProductListIsEmpty() {
        String expectedMessage = "Отсутствует товар";
        String actualMessage = "";

        assertThrows(OutOfStockException.class, () ->
                service.getProducts("Молочка"));

        try {
            service.getProducts("Молочка");
        } catch (OutOfStockException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @Test
    @DisplayName("Ошибка извлечения товара - отсутствует категория")
    public void testGetProductNotFoundInList() {
        Product expectedProduct = new Product("Яблоки", 135, "Фрукты");
        String expectedMessage = "Отсутствует товар";
        String actualMessage = "";
        service.setIsInventoryOpen(true);

        service.add(expectedProduct);

        assertThrows(OutOfStockException.class, () ->
                service.getProducts("Молочка"));

        try {
            service.getProducts("Молочка");
        } catch (OutOfStockException e) {
            actualMessage = e.getMessage();
            Assertions.assertEquals(expectedMessage, actualMessage);
            return;
        }
        assert false : "Исключение не выброшено";
    }

    @Test
    @DisplayName("Извлечение товара по цене")
    public void testGetProductPriceValid() {
        Product expectedProduct1 = new Product("Молоко", 65, "Молочка");
        Product expectedProduct2 = new Product("Сметана", 70, "Молочка");
        service.setIsInventoryOpen(true);

        service.add(expectedProduct1);
        service.add(expectedProduct2);

        List<Product> productList = service.filterByPrice("Молочка", 68);
        Product actualProduct = productList.get(0);

        assertEquals(expectedProduct1, actualProduct, "Должен вернуться первый добавленный товар");
    }
}