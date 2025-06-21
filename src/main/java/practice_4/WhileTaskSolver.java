package practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        //1. Вычисление факториала с помощью while
        calcFactorial();

        System.out.println("-----------------------------------");

        //2. Вывод всех чётных чисел до заданного
        eventNumber();

        System.out.println("-----------------------------------");

        //3. Обратный отсчёт от введённого числа до 1
        reverseNumber();
    }

    public static void calcFactorial() {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Введите число от 1");
        } else {
            int i = 1;

            while (i <= number) {
                result *= i;
                i++;
            }
        }
        System.out.println("Факториал числа " + number + " равен " + result);
    }

    public static void eventNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Введите число от 1");
        } else {
            int i = 1;

            while (i <= number) {
                if (i % 2 == 0) {
                    System.out.println("Четное число: " + i);
                }
                i++;
            }
        }
    }

    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.println("Число: " + number);
            number--;
        }
    }
}
