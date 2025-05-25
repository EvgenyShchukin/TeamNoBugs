package practice_5.tasks.AmusementPark;

public class Switchback implements Attraction {
    @Override
    public void service() {
        System.out.println("Проверить безопасность атрациона: Американские горки");
    }

    @Override
    public void checkSecurity() {
        System.out.println("Проверить техническое состояние атрациона: Американские горки");
    }
}
