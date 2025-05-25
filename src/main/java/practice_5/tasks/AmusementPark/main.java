package practice_5.tasks.AmusementPark;

public class main {
    public static void main(String[] args) {
        AttractionManager attractionManager = new AttractionManager();

        attractionManager.addAttraction(new Carousel());
        attractionManager.forceCheckSecurity();

        System.out.println("----------------------------------------------------");

        attractionManager.addAttraction(new Switchback());
        attractionManager.forceService();
    }
}
