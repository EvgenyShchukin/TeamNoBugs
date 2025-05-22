package practice_4;


import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // метод определения знака числа
        checkSignNumber();
        checkSignNumber();
        checkSignNumber();
        System.out.println("-------------------------------------------");

        // метод определения максимального числа из двух чисел
        maxFromTwoNumber();
        maxFromTwoNumber();
        System.out.println("-------------------------------------------");

        // метод вывода оценки по школе
        outGradeSchool();
        outGradeSchool();
        System.out.println("-------------------------------------------");

        // метод проверки числа на четность
        checkParityNumber();
        checkParityNumber();
        System.out.println("-------------------------------------------");

        // метод определения размера скидки по возрасту
        checkDiscountSize();
        checkDiscountSize();
        checkDiscountSize();
        System.out.println("-------------------------------------------");

        // метод определения оценки по результатам тестов
        checkResultsTests();
        checkResultsTests();
        checkResultsTests();
        System.out.println("-------------------------------------------");
    }

    public static void checkSignNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void maxFromTwoNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Максимальное число: " + Math.max(a, b));
    }

    public static void outGradeSchool() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int grade = scanner.nextInt();

        switch (grade) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 2, 1 -> System.out.println("Неудовлетворительно");
        }
    }

    public static void checkParityNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void checkDiscountSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько Вам лет");
        int number = scanner.nextInt();

        if (number < 18) {
            System.out.println("Размер скидки составляет: 25%");
        } else if (number >= 65) {
            System.out.println("Размер скидки составляет: 30%");
        } else {
            System.out.println("Скидка отсутствует");
        }
    }

    public static void checkResultsTests() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько у Вас баллов");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 100) {
            System.out.println("Отлично");
        } else if (number >= 75 && number <= 89) {
            System.out.println("Хорошо");
        } else if (number >= 60 && number <= 74) {
            System.out.println("Удовлетворительно");
        } else if (number >= 0 && number < 60) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Введено некорректное число");
        }
    }
}
