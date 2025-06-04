package practice_8.generics.task3;

public class Pair<T, U> {
    //3. Задача на дженерик с двумя типами данных
    //Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T item) {
        this.first = first;
    }

    public void setSecond(U item) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair pair = new Pair(1,2);
        pair.getFirst();
        pair.setFirst(3);
        pair.getSecond();
        pair.setSecond(4);
    }
}


