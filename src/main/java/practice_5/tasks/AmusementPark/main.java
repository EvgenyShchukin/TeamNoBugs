package practice_5.tasks.amusementPark;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        Carousel carousel = new Carousel();
        park.addAttraction(carousel);
        park.printInfo();
        park.printMaintain();
        park.removeAttraction();

        System.out.println("------------------------------");

        RollerCoaster rollerCoaster = new RollerCoaster();
        park.addAttraction(rollerCoaster);
        park.printInfo();
        park.printMaintain();
        park.removeAttraction();
    }
}
