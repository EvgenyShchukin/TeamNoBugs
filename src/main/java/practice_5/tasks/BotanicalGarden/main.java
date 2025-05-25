package practice_5.tasks.BotanicalGarden;

public class main {
    public static void main(String[] args) {
        PlantManager plantManager = new PlantManager();

        plantManager.addPlant(new Cactus());
        plantManager.giveHumidity();
        plantManager.giveLight();

        System.out.println("-------------------------------------");

        plantManager.addPlant(new Orchid());
        plantManager.giveHumidity();
        plantManager.giveLight();
    }
}
