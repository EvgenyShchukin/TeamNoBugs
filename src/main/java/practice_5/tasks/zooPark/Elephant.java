package practice_5.tasks.zooPark;

public class Elephant extends Animal {

    @Override
    public void move() {
        System.out.println("ходит");
    }

    @Override
    public void makeSound() {
        System.out.println("Буууууууууууууууу");
    }

    @Override
    public String toString() {
        return "Слон";
    }
}
