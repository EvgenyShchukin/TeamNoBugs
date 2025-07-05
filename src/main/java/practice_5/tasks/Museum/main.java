package practice_5.tasks.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Sculpture sculpture = new Sculpture();
        museum.addExhibit(sculpture);
        museum.printDescribe();
        museum.printPreserve();
        museum.removeExhibit();

        System.out.println("--------------------");

        Manuscript manuscript = new Manuscript();
        museum.addExhibit(manuscript);
        museum.printDescribe();
        museum.printPreserve();
        museum.removeExhibit();
    }
}
