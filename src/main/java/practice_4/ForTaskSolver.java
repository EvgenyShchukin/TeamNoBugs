package practice_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        //1. Вывод чисел от 1 до 100, делящихся на 3
        checkNumberDivideThree();

        System.out.println("------------------------------------------");

        //2. Сумма чисел от 1 до n
        sumNumber();

        System.out.println("------------------------------------------");

        //3. Таблица умножения для числа
        multiplyNumber();

        System.out.println("------------------------------------------");

        //4. Проверка на простое число
        printNumberChecker();

        System.out.println("------------------------------------------");

        //5. Вывод чисел от 1 до 10
        outNumberTen();
    }

    public static void checkNumberDivideThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumNumber() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введите число от 1");
        } else {
            for (int i = 0; i < number; i++) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма ровна: " + sum);
    }

    public static void multiplyNumber() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введите число от 1");
        } else {
            for (int i = 1; i <= 10; i++) {
                result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }
        }
    }

    public static void printNumberChecker() {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int number = scanner.nextInt();

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " является " + isPrime);
    }

    public static void outNumberTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

