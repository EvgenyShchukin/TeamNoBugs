package practice_5.tasks.botanicalGarden;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Добавлено новое растение: " + plant);
    }

    public void printCare() {
        this.plant.care();
    }

    public void removePlant() {
        System.out.println("Удалено растение " + plant);
        this.plant = null;
    }
}
