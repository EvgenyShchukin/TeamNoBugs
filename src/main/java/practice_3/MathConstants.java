package practice_3;

public class MathConstants {
    private static final double PI = 3.14159;
    private static final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return MathConstants.PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * MathConstants.PI * r;
    }

    public static void main(String[] args) {
        System.out.println("Площадь круга ровна: " + calculateCircleArea(4));
        System.out.println("Длина окружности ровна: " + calculateCircumference(6));
    }
}
