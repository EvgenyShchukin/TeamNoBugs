package practice_5.tasks.Museum;

public class main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.addExhibit(new Manuscript());
        museum.forceHumidityControl();
        museum.forceRestoration();

        System.out.println("============================");
        museum.addExhibit(new Sculpture());
        museum.forceRestoration();
        museum.forceHumidityControl();
    }
}
