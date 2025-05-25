package practice_5.tasks.AmusementPark;

public class Carousel implements Attraction {
    @Override
    public void service() {
        System.out.println("Проверить безопасность атрациона: Карусель");
    }

    @Override
    public void checkSecurity() {
        System.out.println("Проверить техническое состояние атрациона: Карусель");
    }
}
