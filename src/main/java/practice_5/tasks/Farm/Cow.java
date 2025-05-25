package practice_5.tasks.Farm;

public class Cow  extends FarmAnimal {
    @Override
    public void give() {
        System.out.println("Корова дает молоко");
    }

    @Override
    public void requires() {
        System.out.println("Корова требует выпаса");
    }
}
