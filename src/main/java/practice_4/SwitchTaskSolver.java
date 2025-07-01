package practice_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //1. Вывод дня недели по номеру
        checkDayWeek();

        //2. Стоимость билета по дню недели
        checkPriceTicketDays();

        //3. Перевод числовых оценок в буквенные (A–F)
        convertSign();

        //4. Обработка текстовых команд
        inputCommand();

        //5. Простой калькулятор с использованием switch
        calcNumber();

    }

    public static void checkDayWeek() {
        System.out.println("Введите число");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }
    }

    public static void checkPriceTicketDays() {
        System.out.println("Введите день недели");
        String day = scanner.nextLine();

        switch (day) {
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" ->
                    System.out.println("Стоимость билета ровна: 300 рублей");
            case "Суббота", "Воскресенье" -> System.out.println("Стоимость билета ровна: 450 рублей");
        }
    }

    public static void convertSign() {
        System.out.println("Введите сколько у Вас баллов");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("D");
        } else if (number >= 0 && number <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Введено некорректное число");
        }
    }

    public static void inputCommand() {
        System.out.println("Введите команду");
        String command = scanner.nextLine();

        switch (command) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Текущий статус системы");
            default -> System.out.println("Команда не найдена");
        }
    }

    public static void calcNumber() {
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите оператор");
        String operator = scanner.nextLine();

        if (b == 0 && operator.equals("/")) {
            System.out.println("Ошибка: Делить на 0 нельзя");
        } else {
            switch (operator) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> System.out.println(a / b);
                default -> System.out.println("Введен некорректный оператор");
            }
        }
    }

}
