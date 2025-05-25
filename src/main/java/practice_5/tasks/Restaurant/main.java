package practice_5.tasks.Restaurant;

public class main {
    public static void main(String[] args) {
        Menu dish = new Menu();

        dish.addMenu(new Drink(100));
        dish.showCaracteristics();

        System.out.println("--------------------------------------------------");
        dish.addMenu(new HotDish(150));
        dish.showCaracteristics();
    }
}
