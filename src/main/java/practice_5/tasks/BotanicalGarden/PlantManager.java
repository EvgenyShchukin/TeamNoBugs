package practice_5.tasks.BotanicalGarden;

public class PlantManager {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Лог: Добавили растение");
    }

    public void giveHumidity() {
        plant.humidity();
    }

    public void giveLight() {
        plant.light();
    }
}
