package practice_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamApiAggregationOperations {
    public static void main(String[] args) {
        //1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.

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

        Optional<Integer> max = intList.stream().max((x,y) -> x-y);
        System.out.println("Максимальное число: " + max.get());

        System.out.println("---------------------------------------------");

        //2. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.

        Optional<Integer> min = intList.stream().min((Integer::compare));
        System.out.println("Минимальное число: " + min.get());

        System.out.println("---------------------------------------------");

        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.

        int sum = intList.stream().mapToInt(x -> x)
                .sum();

        System.out.println("Сумма числе: " + sum);

        System.out.println("---------------------------------------------");

        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.

        List<String> stringCirList = new ArrayList<>();
        stringCirList.add("Евгений");
        stringCirList.add("Борис");
        stringCirList.add("Катя");
        stringCirList.add("Лена");
        stringCirList.add("Богдан");
        stringCirList.add("Кеша");
        stringCirList.add("Аня");

        Optional<String> first = stringCirList.stream().filter(s -> s.startsWith("Б")).findFirst();

        System.out.println("Первый элемент: " + first.get());

        System.out.println("---------------------------------------------");

        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
        // который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.

        boolean isVen = intList.stream().anyMatch(x -> x < 0);
        System.out.println("В списке есть отрицательные элементы? " + isVen);


    }
}
