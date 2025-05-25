package practice_5.tasks.BotanicalGarden;

public class Cactus extends Plant{
    @Override
    public void humidity() {
        System.out.println("Кактус требует много света");
    }

    @Override
    public void light() {
        System.out.println("Кактус не любит воду");
    }
}
