package practice_4;


import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        //Метод вывода чисел делящихся на 3
        checkNumberDivideThree();
        System.out.println("---------------------------------------------------------------");

        //Метод вывода суммы чисел
        sumNumber();
        System.out.println("---------------------------------------------------------------");

        //Метод умножения числа по таблице умножения
        multipllyNumber();
        System.out.println("---------------------------------------------------------------");

        //Метод проверки на простое число
        primeNumberChecker();
        primeNumberChecker();
        System.out.println("---------------------------------------------------------------");

        //Метод вывода чисел от 1 до 10
        outNumberTen();
        System.out.println("---------------------------------------------------------------");
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
        }
        for (int i = 0; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("Скмма ровна: " + sum);
    }

    public static void multipllyNumber() {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public static void primeNumberChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не простое число");
        }
    }

    public static void outNumberTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число: " + i);
        }
    }
}
