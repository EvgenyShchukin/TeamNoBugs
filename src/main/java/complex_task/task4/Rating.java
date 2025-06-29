package complex_task.task4;

public class Rating<T extends Number> {

    private T number;


    public Rating(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
