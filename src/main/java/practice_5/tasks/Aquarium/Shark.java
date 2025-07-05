package practice_5.tasks.aquarium;

public class Shark extends SeaCreature {
    @Override
    public void move() {
        System.out.println("Плавает быстро и агрессивно");
    }

    @Override
    public String toString() {
        return "Акула";
    }
}
