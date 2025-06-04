package practice_8.exceptions;

public class Task2 {
    public static void main(String[] args) {
        // Деление без исключения
        divide(6, 3);
        // Деление на 0 с исключением
        divide(6, 0);

    }

    public static void divide(int a, int b) {
        int count = 0;
        if (b == 0) {
            try {
                count = a / b;
            } catch (Exception e) {
                System.err.println("Нельзя делить на 0");
            }
        } else {
            count = a / b;
        }

        System.out.println(count);
    }
}
