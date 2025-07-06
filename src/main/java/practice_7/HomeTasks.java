package practice_7;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomeTasks {
    public static void main(String[] args) {
        /****
         * 7. Упорядоченный список:
         * Данные должны оставаться отсортированными, а поиск минимального и максимального значения должен быть быстрым.
         */

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(12);
        treeSet.add(-4);
        treeSet.add(-8);
        treeSet.add(5);
        treeSet.add(11);

        System.out.println("Список чисел: " + treeSet);
        System.out.println("Максимальное число: " + treeSet.last());
        System.out.println("Минимальное число: " + treeSet.first());

        System.out.println("-------------------------------------");

        /***
         * В задаче №15 необходимо реализовать структуру данных, которая позволяет добавлять новые задачи,
         * удалять старые и сортировать задачи по их срокам выполнения.
         */

        TreeMap<String, LocalDate> treeMap = new TreeMap<>();
        treeMap.put("Task1", LocalDate.of(2025, 6, 30));
        treeMap.put("Task2", LocalDate.of(2025, 7, 4));
        treeMap.put("Task3", LocalDate.of(2024, 2, 12));
        treeMap.put("Task4", LocalDate.of(2023, 6, 23));
        treeMap.put("Task5", LocalDate.of(2023, 10, 11));
        treeMap.put("Task6", LocalDate.of(2022, 1, 6));
        treeMap.put("Task7", LocalDate.of(2025, 3, 5));

        for (Map.Entry<String, LocalDate> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-------------------------------------");

        treeMap.remove("Task5");

        for (Map.Entry<String, LocalDate> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-------------------------------------");

        treeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(LocalDate::compareTo))
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        /**
         * 17. Система рейтингов:
         * Нужно хранить игроков так, чтобы можно было быстро находить лучшего.
         */

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Петя", 42);
        map.put("Настя", 55);
        map.put("Коля", 70);
        map.put("ОЛег", 81);
        map.put("Лена", 90);
        map.put("Аня", 88);

        System.out.println("Лучший игрок: " + map.firstKey());

    }


}
