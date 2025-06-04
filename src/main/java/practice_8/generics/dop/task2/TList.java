package practice_8.generics.dop.task2;

import java.util.ArrayList;
import java.util.List;

public class TList {
    //Обобщённый метод
    //Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.


    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("Вася");
        testList.add("Петя");
        testList.add("Оля");

        printList(testList);
    }

    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println("Элемент: " + t.toString());
        }
    }
}
