package practice_5.tasks.aquarium;

public class Starfish extends SeaCreature {
    @Override
    public void move() {
        System.out.println("Медленно ползает");
    }

    @Override
    public String toString() {
        return "Морская звезда";
    }
}
