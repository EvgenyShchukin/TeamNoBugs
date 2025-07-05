package practice_5.tasks.botanicalGarden;

public class Cactus implements Plant {
    @Override
    public void care() {
        System.out.println("Требует много света и редкий полив");
    }

    @Override
    public String toString() {
        return "Кактус";
    }
}
