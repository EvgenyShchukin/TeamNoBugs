package practice_5.tasks.Restaurant;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void showCaracteristics() {
        System.out.println("Температура блюда: " + this.temperature);
    }
}
