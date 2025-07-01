package practice_4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DoWhileTaskSolder {
    public static void main(String[] args) {
        //1. Запрос положительного числа
        inputPositiveNumber();

        System.out.println("----------------------------");

        //2. Проверка пароля
        inputValidPassword();

        System.out.println("----------------------------");

        //3. Вывод чисел от 1 до 10 с использованием do-while
        outNumberToTen();

        System.out.println("----------------------------");

        //4. Завершение программы по команде "exit"
        inputExit();

        System.out.println("----------------------------");

        //5. Подсчёт количества цифр в числе
        sumNumber();
    }

    public static void inputPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите число");

        do {
            number = scanner.nextInt();
        } while (number <= 0);
    }

    public static void inputValidPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "12345";
        String text;
        System.out.println("Введите пароль");

        do {
            text = scanner.nextLine();
        } while (!text.equals(password));
    }

    public static void outNumberToTen() {
        int i = 1;

        do {
            System.out.println("Число: " + i);
            i++;
        } while (i < 11);
    }

    public static void inputExit() {
        Scanner scanner = new Scanner(System.in);
        String exit = "exit";
        String text;
        System.out.println("Введите команду");

        do {
            text = scanner.nextLine();
        } while (!text.equals(exit));
    }

    public static void sumNumber() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введите число больше 0");
        } else {
            do {
                number = number / 10;
                count++;
            } while (number > 0);
        }
        System.out.println("Сумма: " + count);
    }
}
