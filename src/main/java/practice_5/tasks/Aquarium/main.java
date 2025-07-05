package practice_5.tasks.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Shark shark = new Shark();
        aquarium.addSeaCreature(shark);
        aquarium.forceMove();
        aquarium.removeSeaCreature();

        System.out.println("-----------------------------");

        Starfish starfish = new Starfish();
        aquarium.addSeaCreature(starfish);
        aquarium.forceMove();
        aquarium.removeSeaCreature();
    }
}
