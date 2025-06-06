package practice_9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiGroupOperations {
    public static void main(String[] args) {
        //1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.

        List<String> stringList = new ArrayList<>();
        stringList.add("Anna");
        stringList.add("Oleg");
        stringList.add("Alex");
        stringList.add("Semen");
        stringList.add("Alisa");
        stringList.add("Elena");
        stringList.add("Evgeny");

        Map<Character, List<String>> map = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        for (Map.Entry<Character, List<String>> characterListEntry : map.entrySet()) {
            System.out.println(characterListEntry);
        }

        System.out.println("---------------------------------------------");

        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.

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

        Set<Map.Entry<Boolean, List<Integer>>> entries = intList.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0)).entrySet();

        entries.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.

        OptionalDouble average = intList.stream().mapToInt((x) -> x)
                .average();

        System.out.println("Среднее значение: " + average.getAsDouble());
    }
}
