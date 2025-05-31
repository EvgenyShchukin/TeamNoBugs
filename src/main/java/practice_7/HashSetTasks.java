package practice_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetTasks {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Petr");
        strings.add("Lena");
        strings.add("Petr");
        strings.add("Oleg");
        strings.add("Lena");


        //Задача 1:
        //Создайте HashSet из 5 чисел и выведите его содержимое.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println("Вывод содержимого HashSet: ");
        hashSet.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        //Задача 2:
        //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        HashSet<Integer> hashDigital = new HashSet<>();
        hashDigital.add(1);
        hashDigital.add(2);
        hashDigital.add(3);
        hashDigital.add(4);
        hashDigital.add(5);
        hashDigital.add(6);
        hashDigital.add(7);
        hashDigital.add(8);
        hashDigital.add(9);
        hashDigital.add(10);

        System.out.println("Проверяем наличие числа: 7");
        if (hashDigital.contains(7)) {
            System.out.println("Число присутствует");
        } else {
            System.out.println("Число не найдено");
        }

        System.out.println("-------------------------------------------");

        System.out.println("Передаем List со значениями: " + strings);
        convertListToSet(strings);

        System.out.println("-------------------------------------------");

        //Задача 4:
        //Создайте HashSet, содержащий набор имен. Напишите программу,
        // которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
        HashSet<String> names = new HashSet<>();
        names.add("Elena");
        names.add("Pavel");
        names.add("Oleg");
        names.add("Evgeny");
        names.add("Vadim");
        names.add("Liza");

        if (names.contains("Evgeny")) {
            System.out.println("Имя Evgeny найдено");
        } else {
            System.out.println("Имя не найдено");
        }
    }

    //Задача 3:
    //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    public static Set<String> convertListToSet(List<String> strings) {
        HashSet<String> toHashSet = new HashSet<>();
        toHashSet = (HashSet<String>) strings.stream().collect(Collectors.toSet());
        System.out.println("Список SET содержит:" + toHashSet);
        return toHashSet;
    }
}
