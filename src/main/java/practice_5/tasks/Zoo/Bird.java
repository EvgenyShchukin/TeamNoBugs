package practice_5.tasks.Zoo;

public class Bird extends Animal {


    @Override
    public void move() {
        System.out.println("Летает");
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
