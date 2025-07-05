package practice_5.tasks.restaurant;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void showDishOptions() {
        System.out.println("Температура блюда: " + this.temperature);
    }

    @Override
    public String toString() {
        return "Горячее блюдо";
    }
}
