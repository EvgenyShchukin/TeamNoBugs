package practice_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Определение знака числа
        checkSignNumber();
        checkSignNumber();
        checkSignNumber();


        System.out.println("--------------------------------------");

        //2. Поиск наибольшего из двух чисел
        maxFromTwoNumber();
        maxFromTwoNumber();

        System.out.println("--------------------------------------");

        //3. Вывод оценки по шкале 1–5
        outGradeSchool();
        outGradeSchool();
        outGradeSchool();

        System.out.println("--------------------------------------");

        //4. Проверка на чётность
        checkParityNumber();
        checkParityNumber();

        //5. Определение размера скидки по возрасту
        checkDiscountSize();
        checkDiscountSize();
        checkDiscountSize();

    }

    public static void checkSignNumber() {
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно 0");
        }
    }

    public static void maxFromTwoNumber() {
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println("Максимальное число: " + Math.max(a, b));
    }

    public static void outGradeSchool() {
        System.out.println("Введите оценку");
        int grade = scanner.nextInt();

        switch (grade) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 2 -> System.out.println("Неудовлетворительно");
            case 1 -> System.out.println("Неудовлетворительно");
        }
    }

    public static void checkParityNumber() {
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void checkDiscountSize() {
        System.out.println("Введите сколько Вам лет");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Размер скидки составляет: 25%");
        } else if (age >= 65) {
            System.out.println("Размер скидки составляет: 30%");
        } else {
            System.out.println("Скидка отсутствует");
        }

    }

}
