package practice_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // метод определения дня недели
        chechDayWeek();
        chechDayWeek();
        System.out.println("-------------------------------------------------------");

        // метод определения стоимость билета по дню недели
        chechPriceTicketDays();
        chechPriceTicketDays();
        System.out.println("-------------------------------------------------------");

        // метод определения перевода числовых оценок в буквенные
        convertSign();
        convertSign();
        convertSign();
        System.out.println("-------------------------------------------------------");

        // метод обработки текстовых команд
        inputCommand();
        inputCommand();
        System.out.println("-------------------------------------------------------");

        // метод калькулятор
        calcNumber();
        calcNumber();
        System.out.println("-------------------------------------------------------");
    }

    public static void chechDayWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Введено некорректное число");
        }
    }

    public static void chechPriceTicketDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите день недели");
        String day = scanner.nextLine();

        switch (day) {
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" ->
                    System.out.println("Стоимость билета: 300 рублей");
            case "Суббота", "Воскресенье" -> System.out.println("Стоимость билета: 450 рублей");
        }
    }

    public static void convertSign() {
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
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
                default -> System.out.println("Введен недопустимый оператор");
            }
        }
    }
}
