package practice_5.tasks.petManager;

public class Cat extends Animal {
    @Override
    public void feed() {
        System.out.println("Ест влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Играет");
    }

    @Override
    public String toString() {
        return "Кошка";
    }
}
