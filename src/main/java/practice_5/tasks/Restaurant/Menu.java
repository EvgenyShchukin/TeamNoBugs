package practice_5.tasks.restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Добавлено блюдо: " + dish);
    }

    public void showDishOptions() {
        this.dish.showDishOptions();
    }

    public void removeDish() {
        this.dish = null;
        System.out.println("Блюдо удалено ");
    }
}
