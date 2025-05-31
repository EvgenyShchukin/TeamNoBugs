package practice_7;

import java.util.ArrayList;

public class ArrayListTasks {
    public static void main(String[] args) {


        // Задача 1:
        //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
        ArrayList<Integer> number = new ArrayList<>();
        number.add(0, 1);
        number.add(1, 2);
        number.add(2, 3);
        number.add(3, 4);
        number.add(4, 5);
        System.out.println("Текущий списко" + number);
        number.add(5, 6);
        System.out.println("Список с добавленным элементом" + number);

        System.out.println("-----------------------------------------------");

        // Задача 2:
        //Напишите программу, которая выводит все чётные числа из ArrayList.
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer i : number) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println("Четные числа" + evenNumbers);

        System.out.println("---------------------------------------");

        //Задача 3:
        //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
        String text = "";
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Lena");
        strings.add("Kir");
        strings.add("Semen");
        strings.add("Oleg");
        strings.add("Evgeny");

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > text.length()) {
                text = strings.get(i);
            }
        }
        System.out.println("Самая длинная строка " + text);

        System.out.println("----------------------------------------------");

        //Задача 4:
        //Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
        int sum = 0;
        ArrayList<Integer> digitalSum = new ArrayList<>();
        digitalSum.add(8);
        digitalSum.add(12);
        digitalSum.add(24);
        digitalSum.add(16);
        digitalSum.add(20);

        for (int i = 0; i < digitalSum.size(); i++) {
            sum = sum + digitalSum.get(i);
        }
        System.out.println("Сумма всех чисел в списке " + sum);

        System.out.println("----------------------------------------------");

        //Задача 5:
        //Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> digitalMax = new ArrayList<>();
        digitalMax.add(8);
        digitalMax.add(12);
        digitalMax.add(24);
        digitalMax.add(16);
        digitalMax.add(20);

        for (int i = 0; i < digitalMax.size(); i++) {
            if (digitalMax.get(i) > max) {
                max = digitalMax.get(i);
            }
        }
        System.out.println("Максимальное число в списке " + max);
    }
}
