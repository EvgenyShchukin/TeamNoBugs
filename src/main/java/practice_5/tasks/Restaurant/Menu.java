package practice_5.tasks.Restaurant;

public class Menu {
    Dish dish;

    public void addMenu(Dish dish) {
        this.dish = dish;
        System.out.println("Лог: Добавлено блюдо");
    }

    public void showCaracteristics() {
        System.out.println("Описание блюда :");
        dish.showCaracteristics();
    }
}
