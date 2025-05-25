package practice_5.tasks.Pet;

public class Dog extends Pet implements Walkable{

    @Override
    public void eat() {
        System.out.println("Собка питается сухим кормом");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
