package practice_5.tasks.petManager;

public class Dog extends Animal {
    @Override
    public void feed() {
        System.out.println("Ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("Гуляет");
    }

    @Override
    public String toString() {
        return "Собака";
    }
}
