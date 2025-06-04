package practice_8.generics.dop.task1;

public class Main {
    public static void main(String[] args) {
        Storage<Integer> integerStorage = new Storage<>(1);
        System.out.println("Старое значение integerStorage: " + integerStorage.get());
        integerStorage.set(2);
        System.out.println("Новое значение integerStorage: " + integerStorage.get());

        System.out.println("------------------------------------");

        Storage<String> stringStorage = new Storage<>("old");
        System.out.println("Старое значение stringStorage: " + stringStorage.get());
        stringStorage.set("new");
        System.out.println("Новое значение stringStorage: " + stringStorage.get());
    }
}
