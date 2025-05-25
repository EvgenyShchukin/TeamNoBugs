package practice_5.tasks.Restaurant;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showCaracteristics() {
        System.out.println("Объем напитка: " + this.volume);
    }
}
