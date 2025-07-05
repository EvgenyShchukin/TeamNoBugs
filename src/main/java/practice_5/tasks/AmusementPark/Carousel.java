package practice_5.tasks.amusementPark;

public class Carousel extends Attraction {
    @Override
    public void info() {
        System.out.println("Спокойный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("Техническое обслуживание");
    }

    @Override
    public String toString() {
        return "Карусель";
    }
}
