package practice_5.tasks.amusementPark;

public class Park {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Добавлен аттракцион: " + attraction);
    }

    public void printInfo() {
        this.attraction.info();
    }

    public void printMaintain() {
        this.attraction.maintain();
    }

    public void removeAttraction() {
        System.out.println("Удален аттракцион " + attraction);
        this.attraction = null;
    }
}
