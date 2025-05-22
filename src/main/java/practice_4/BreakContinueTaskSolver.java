package practice_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        // метод подсчета суммы чисел
        sumNumber();
        System.out.println("------------------------------------------------");

        // метод пропуска числа 3 при выводе чисел
        skipNumberThree();
        System.out.println("------------------------------------------------");

        // метод вывода только положительных чисел
        outPositiveNumbers();
        System.out.println("------------------------------------------------");

        // метод ввода строк до команды "stop"
        inputTextStop();
        System.out.println("------------------------------------------------");
    }

    public static void sumNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Сумма чисел ровна: " + sum);
    }

    public static void skipNumberThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Число: " + i);
        }
    }

    public static void outPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            System.out.println("Число: " + number);
        }
    }

    public static void inputTextStop() {
        Scanner scanner = new Scanner(System.in);
        String text;

        while (true) {
            text = scanner.nextLine();
            if (text.equals("stop")) {
                break;
            }
            System.out.println("Строка: " + text);
        }
    }
}
