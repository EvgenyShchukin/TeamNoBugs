package practice_7;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
    private static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    public static void main(String[] args) {
        //Задача 1:
        //Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

        linkedHashSet.add("Первый");
        linkedHashSet.add("Второй");
        linkedHashSet.add("Пятый");
        linkedHashSet.add("Третий");
        linkedHashSet.add("Четвертый");

        System.out.println("Вывод элементов LinkedHashSet:");
        linkedHashSet.forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        //Задача 2:
        //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
        System.out.println("Добавление нового элементов");
        addElement("Седьмой");
        System.out.println("Добавление старого элементов");
        addElement("Пятый");

    }

    public static void addElement(String text) {
        if (!linkedHashSet.contains(text)) {
            linkedHashSet.add(text);
            System.out.println("Элемент успешно добавлен");
            System.out.println(linkedHashSet);
        } else {
            System.out.println("Данный элемент уже содержится в LinkedHashSet");
            System.out.println(linkedHashSet);
        }
    }
}
