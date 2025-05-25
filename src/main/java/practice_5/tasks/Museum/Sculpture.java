package practice_5.tasks.Museum;

public class Sculpture extends Exhibit {
    @Override
    public void humidityControl() {
        System.out.println("Скульптура требует контроля влажности");
    }

    @Override
    public void restoration() {
        System.out.println("Скульптура требует реставрации");
    }
}
