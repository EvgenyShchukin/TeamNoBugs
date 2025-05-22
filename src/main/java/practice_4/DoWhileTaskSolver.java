package practice_4;


import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // метод запроса положительного числа
        inputPositiveNumber();
        System.out.println("--------------------------------------------------");

        // метод запроса валидного пароля
        inputValidPassword();
        System.out.println("--------------------------------------------------");

        // метод вывода чисел от 1 до 10
        outNumberToTen();
        System.out.println("--------------------------------------------------");

        // метод завершения программы "exit"
        inputExit();
        System.out.println("--------------------------------------------------");

        // метод подсчета количества цифр в числе
        sumOfDigits();
        System.out.println("--------------------------------------------------");
    }

    public static void inputPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
        } while (number < 0);
    }

    public static void inputValidPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "12345";
        String string;
        do {
            string = scanner.nextLine();
        } while (!string.equals(password));
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
        String string;
        do {
            string = scanner.nextLine();
        } while (!string.equals("exit"));
    }

    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        if (number <= 0) {
            System.out.println("Введите число больше 0");
        } else {
            do {
                number = number / 10;
                count++;
            } while (number > 0);
        }
    }
}
