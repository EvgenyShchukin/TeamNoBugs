package practice_5.tasks.zooPark;

public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("летает");
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }

    @Override
    public String toString() {
        return "Птица";
    }
}
