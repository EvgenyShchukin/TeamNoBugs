package practice_5.tasks.farm;

public class Cow extends FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Ест траву");
    }

    @Override
    public void care() {
        System.out.println("Нуждается в выпосе");
    }

    @Override
    public void produce() {
        System.out.println("Дает молоко");
    }

    @Override
    public String toString() {
        return "Корова";
    }
}
