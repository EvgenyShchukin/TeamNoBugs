package practice_7;

import org.w3c.dom.ls.LSOutput;

import java.util.TreeSet;

public class TreeSetTasks {
    private static TreeSet<Integer> treeSet = new TreeSet<>();

    public static void main(String[] args) {
        //Задача 1:
        //Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);

        System.out.println("Вывод элементов TreeSet");
        treeSet.forEach(System.out::println);

        System.out.println("--------------------------------------------");

        //Задача 2:
        //Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
        System.out.println("Добавление нового элемента");
        addElement(7);
        System.out.println("Добавление старого элемента");
        addElement(3);

        System.out.println("--------------------------------------------");

        //Задача 3:
        //Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        int value = 4;

        System.out.println("Большее число = " + treeSet.higher(value));
        System.out.println("Меньшее число = " + treeSet.lower(value));

    }

    public static void addElement(int number) {
        if (!treeSet.contains(number)) {
            treeSet.add(number);
            System.out.println("Элемент добавлен в TreeSet");
            System.out.println(treeSet);
        } else {
            System.out.println("Элемент уже содержится в TreeSet");
            System.out.println(treeSet);
        }
    }
}
