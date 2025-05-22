package practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        //метод вычисления факториала
        calcFactorial();
        System.out.println("-------------------------------------");

        //метод вывода четных чисел
        outEvenNumber();
        System.out.println("-------------------------------------");

        //метод отсчета в обратном порядке от введенного числа
        reverseNumber();
        System.out.println("-------------------------------------");
    }

    public static void calcFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Факториал определен только для неотрицательных чисел");
        } else {
            int result = 1;
            int i = 1;

            while (i <= number) {
                result *= i;
                i++;
            }
            System.out.println("Факториал числа " + number + " равен: " + result);
        }
    }

    public static void outEvenNumber() {
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
                    i++;
                }
            }
        }
    }

    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        while (number != 1) {
            System.out.println("Число: " + number);
            number--;
        }
    }
}
