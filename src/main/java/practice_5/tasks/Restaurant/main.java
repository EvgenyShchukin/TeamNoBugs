package practice_5.tasks.restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Drink drink = new Drink(100);
        menu.addDish(drink);
        menu.showDishOptions();
        menu.removeDish();

        System.out.println("----------------------------");

        HotDish hotDish = new HotDish(120);
        menu.addDish(hotDish);
        menu.showDishOptions();
        menu.removeDish();
    }
}
