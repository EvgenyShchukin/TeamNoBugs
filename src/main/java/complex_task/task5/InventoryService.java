package complex_task.task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen = true;
    private final Map<String, List<Product>> products = new HashMap<>();

    public void add(Product product) {
        if (!isInventoryOpen) {
            System.err.println("Добавить товар невозможно");
        }

        if (!products.containsKey(product.getCategory())) {
            products.put(product.getCategory(), new ArrayList<>());
        }

        products.get(product.getCategory()).add(product);
    }

    public Product getProducts(String category) {
        return products.entrySet().stream()
                .filter(entry -> entry.getKey().equals(category))
                .map(Map.Entry::getValue)
                .filter(list -> !list.isEmpty())
                .map(list -> list.remove(0))
                .findFirst()
                .orElseThrow(() -> new OutOfStockException("Отсутствует товар"));
    }

    public List<Product> filterByPrice(String category, int price) {
        return products.getOrDefault(category, List.of())
                .stream()
                .filter(product -> product.getPrice() <= price)
                .collect(Collectors.toList());
    }

    public Map<String, List<Product>> getAll() {
        return products;
    }

    public void setIsInventoryOpen(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }
}
