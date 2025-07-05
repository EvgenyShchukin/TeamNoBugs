package practice_5.tasks.museum;

public class Sculpture extends Exhibit {

    @Override
    public void describe() {
        System.out.println("Стоящая скульптура");
    }

    @Override
    public void preserve() {
        System.out.println("Нуждается в реставрации");
    }

    @Override
    public String toString() {
        return "Скульптура";
    }
}
