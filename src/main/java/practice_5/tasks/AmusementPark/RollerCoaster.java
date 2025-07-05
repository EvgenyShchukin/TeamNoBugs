package practice_5.tasks.amusementPark;

public class RollerCoaster extends Attraction {
    @Override
    public void info() {
        System.out.println("Агрессивный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("Проверка безопасности");
    }

    @Override
    public String toString() {
        return "Американские горки";
    }
}
