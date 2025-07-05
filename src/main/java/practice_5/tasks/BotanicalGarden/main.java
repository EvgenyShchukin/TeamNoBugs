package practice_5.tasks.botanicalGarden;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Cactus cactus = new Cactus();
        garden.addPlant(cactus);
        garden.printCare();
        garden.removePlant();

        System.out.println("----------------------------");

        Orchid orchid = new Orchid();
        garden.addPlant(orchid);
        garden.printCare();
        garden.removePlant();
    }
}
