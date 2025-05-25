package practice_5.tasks.Museum;

public class Manuscript extends Exhibit {
    @Override
    public void humidityControl() {
        System.out.println("Манускрипт требует контроля влажности");
    }

    @Override
    public void restoration() {
        System.out.println("Манускрипт требует реставрации");
    }
}
