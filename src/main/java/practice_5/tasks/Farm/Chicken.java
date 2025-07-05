package practice_5.tasks.farm;

public class Chicken extends FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Ест зерно");
    }

    @Override
    public void care() {
        System.out.println("Нуждается в кормушке");
    }

    @Override
    public void produce() {
        System.out.println("Несет яйца");
    }

    @Override
    public String toString() {
        return "Курица";
    }
}

