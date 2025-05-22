package practice_4;


import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // метод определения знака числа
        checkSignNumber();
        checkSignNumber();
        checkSignNumber();
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
}
