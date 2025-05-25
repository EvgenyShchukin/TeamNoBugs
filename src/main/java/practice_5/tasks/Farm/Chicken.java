package practice_5.tasks.Farm;

public class Chicken extends FarmAnimal {
    @Override
    public void give() {
        System.out.println("Курица несет яйца");
    }

    @Override
    public void requires() {
        System.out.println("Курица требует зерно");
    }
}
