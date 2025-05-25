package practice_5.tasks.AmusementPark;

public class AttractionManager {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Лог: Добавлен аттракцион");
    }

    public void forceService() {
        attraction.service();
    }

    public void forceCheckSecurity() {
        attraction.checkSecurity();
    }
}
