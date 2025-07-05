package practice_5.tasks.restaurant;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDishOptions() {
        System.out.println("Объем напитка: " + this.volume);
    }

    @Override
    public String toString() {
        return "Напиток";
    }
}
