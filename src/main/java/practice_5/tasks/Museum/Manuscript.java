package practice_5.tasks.museum;

public class Manuscript extends Exhibit {

    @Override
    public void describe() {
        System.out.println("Древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Требует контролируемой влажности");
    }

    @Override
    public String toString() {
        return "Манускрипт";
    }
}
