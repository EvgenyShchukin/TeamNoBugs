package practice_5.tasks.museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Добавлено в музей: " + exhibit);
    }

    public void printDescribe() {
        this.exhibit.describe();
    }

    public void printPreserve() {
        this.exhibit.preserve();
    }

    public void removeExhibit() {
        System.out.println("Удалено из музея " + exhibit);
        this.exhibit = null;
    }
}
