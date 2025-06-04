package practice_8.generics.dop.task1;

public class Storage <T>{
    //Обобщённый класс:
    //Объявите класс как class Storage<T>
    //Добавьте поле T item
    //Реализуйте методы:
    //void set(T item) — для установки значения
    //T get() — для получения значения
    //В main() создайте экземпляры класса с типами String, Integer и проверьте работу методов

    private T item;

    public Storage(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }
}
