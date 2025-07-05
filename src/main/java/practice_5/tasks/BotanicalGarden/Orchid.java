package practice_5.tasks.botanicalGarden;

public class Orchid implements Plant{
    @Override
    public void care() {
        System.out.println("Требует высокую влажность и тень");
    }

    @Override
    public String toString() {
        return "Орхидея";
    }
}
