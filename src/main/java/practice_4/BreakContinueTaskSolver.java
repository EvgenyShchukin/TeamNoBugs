package practice_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        //1. Сумма чисел до первого отрицательного (использовать break)
        sumNumber();

        System.out.println("------------------------------------");

        //2. Пропуск чисел, делящихся на 3 (использовать continue)
        skipNumberThree();

        System.out.println("------------------------------------");

        //3. Вывод только положительных чисел (использовать continue)
        outPositiveNumber();

        System.out.println("------------------------------------");

        //4. Ввод строк до команды "stop" (использовать break)
        inputTextStop();
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

    public static void outPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            number = scanner.nextInt();

            if (number < 0) {
                continue;
            } else if (number == 0) {
                break;
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
