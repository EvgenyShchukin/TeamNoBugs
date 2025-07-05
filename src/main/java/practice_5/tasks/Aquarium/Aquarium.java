package practice_5.tasks.aquarium;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Добавлено новое существо: " + seaCreature);
    }

    public void forceMove() {
        this.seaCreature.move();
    }

    public void removeSeaCreature() {
        System.out.println("Существо " + seaCreature + " удалено");
        this.seaCreature = null;
    }
}
