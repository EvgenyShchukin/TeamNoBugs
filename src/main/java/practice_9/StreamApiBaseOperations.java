package practice_9;

import java.util.ArrayList;
import java.util.List;

public class StreamApiBaseOperations {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее
        // , используя Stream API.

        List<String> stringList = new ArrayList<>();
        stringList.add("Evgeny");
        stringList.add("Oleg");
        stringList.add("Elena");
        stringList.add("Ekaterina");
        stringList.add("Pavel");
        stringList.add("Ivan");
        stringList.add("Alisa");

        List<String> newStringList = stringList.stream().filter(s -> s.length() > 5)
                .toList();

        newStringList.forEach(System.out::println);

        System.out.println("----------------------------------------");

        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        List<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(2);
        intList.add(-3);
        intList.add(7);
        intList.add(9);
        intList.add(14);
        intList.add(16);
        intList.add(2);
        intList.add(25);

        List<Integer> newIntList = intList.stream().filter(x -> x % 5 == 0)
                .toList();

        newIntList.forEach(System.out::println);

        System.out.println("----------------------------------------");

        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.

        List<Integer> newStringListLength = stringList.stream().map(s -> s.length())
                .toList();

        newStringListLength.forEach(System.out::println);

        System.out.println("----------------------------------------");

        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
        // где каждое число заменено на его квадрат, используя Stream API.

        List<Integer> newIntSquareList = intList.stream().map(x -> x * x)
                .toList();

        newIntSquareList.forEach(System.out::println);

        System.out.println("----------------------------------------");

        //5. Удаление дубликатов из списка
        //Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.

        List<Integer> newIntNoDuplicateList = intList.stream().distinct()
                .toList();

        newIntNoDuplicateList.forEach(System.out::println);
    }
}
