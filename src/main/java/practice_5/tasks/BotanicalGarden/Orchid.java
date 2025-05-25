package practice_5.tasks.BotanicalGarden;

public class Orchid extends Plant {
    @Override
    public void humidity() {
        System.out.println("Орхидея требует частого полива");
    }

    @Override
    public void light() {
        System.out.println("Орхидея не любит свет");
    }
}
