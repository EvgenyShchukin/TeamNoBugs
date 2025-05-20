package practice_1;

public class MathOperations {
    public static void main(String[] args) {

        Student student = new Student(20, "Elena");
        student.setName("Alina");
        student.setAge(21);
        System.out.println(student.getName() + " " + student.getAge());
        System.out.println("-------------------------------------------------");

        int sum = add(3, 4);
        System.out.println("Результат суммы: " + sum);
        int vith = subtract(6, 4);
        System.out.println("Результат разницы: " + vith);
        int proizv = multiply(2, 4);
        System.out.println("Результат произведения: " + proizv);
        double del = divide(9, 6);
        System.out.println("Результат деления: " + del);
        int max = findMax(3, 4);
        System.out.println("Результат максиума: " + max);
        int razn = difference(6, 4);
        System.out.println("Результат разницы: " + razn);
        double ploch = squareArea(4);
        System.out.println("Результат площади: " + ploch);
        double per = squarePerimeter(6);
        System.out.println("Результат периметра: " + per);
        double minut = convertSecondsToMinutes(180);
        System.out.println("Результат минут: " + minut);
        double spead = averageSpeed(230, 13);
        System.out.println("Результат средней скорости: " + spead);
        double gip1 = findHypotenuse(5, 6);
        System.out.println("Результат гипотенузы1: " + gip1);
        double gip2 = findHypotenuse(12.1, 5.5);
        System.out.println("Результат гипотенузы2: " + gip2);
        double circ1 = circleCircumference(145.54);
        System.out.println("Результат длины окружности_1: " + circ1);
        double circ2 = circleCircumference(120);
        System.out.println("Результат длины окружности_1: " + circ2);
        double percent = calculatePercentage(200, 25);
        System.out.println("Результат вычисления процентов: " + percent);
        double foren = celsiusToFahrenheit(34);
        System.out.println("Результат в форенгейтах: " + foren);
        double cel = fahrenheitToCelsius(14);
        System.out.println("Результат в цельсиях: " + cel);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static double squareArea(int side) {
        return (double) side * side;
    }

    public static double squarePerimeter(int side) {
        return (double) 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        double fath = c * 9 / 5 + 32;
        return fath;
    }

    public static double fahrenheitToCelsius(double f) {
        double cels = (f - 32) * 5 / 9;
        return cels;
    }
}
