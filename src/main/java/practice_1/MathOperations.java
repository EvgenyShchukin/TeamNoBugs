package practice_1;

public class MathOperations {
    //1. Напишите класс MathOperations
    //Условие:
    //Создайте класс MathOperations с методами:
    //add(int x, int y) — возвращает сумму двух чисел
    //subtract(int x, int y) — разницу
    //multiply(int x, int y) — произведение
    //divide(int x, int y) — результат деления в double
    //В main вызовите каждый метод с произвольными числами и выведите результат.

    public static void main(String[] args) {
        System.out.println("Сумма ровна: " + add(7, 8));
        System.out.println("---------------------------------------");
        System.out.println("Разница ровна: " + subtract(12, 9));
        System.out.println("---------------------------------------");
        System.out.println("Произведение составляет: " + multiply(4, 4));
        System.out.println("---------------------------------------");
        System.out.println("Деление составляет: " + divide(15, 4));
        System.out.println("---------------------------------------");
        System.out.println("Максимальное число: " + findMax(3, 4));
        System.out.println("---------------------------------------");
        System.out.println("Разница между числами: " + difference(7, 4));
        System.out.println("---------------------------------------");
        System.out.println("Площадь ровна: " + squareArea(5));
        System.out.println("---------------------------------------");
        System.out.println("Периметр равен: " + squarePerimeter(5));
        System.out.println("---------------------------------------");
        System.out.println("Минут составляет: " + convertSecondsToMinutes(134));
        System.out.println("---------------------------------------");
        System.out.println("Средняя скорость составляет: " + averageSpeed(200, 40));
        System.out.println("---------------------------------------");
        System.out.println("Гипотенуза составляет: " + findHypotenuse(5, 6));
        System.out.println("---------------------------------------");
        System.out.println("Длина окружности составляет: " + circleCircumference(6));
        System.out.println("---------------------------------------");
        System.out.println("Скидка составляет: " + calculatePercentage(200, 25));
        System.out.println("---------------------------------------");
        System.out.println("Температура в фаренгейтах составляет: " + celsiusToFahrenheit(16));
        System.out.println("---------------------------------------");
        System.out.println("Температура в цельсиях составляет: " + fahrenheitToCelsius(19));
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

    //2. Реализуйте метод для нахождения максимума двух чисел
    //Условие:
    //Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
    //Вызовите метод в main и выведите результат.

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    //3. Метод для нахождения разницы между двумя числами
    //Условие:
    //Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
    //Проверьте метод в main.

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    //4. Методы для площади и периметра квадрата
    //Условие:
    //Создайте два метода:
    //squareArea(int side) — возвращает площадь квадрата
    //squarePerimeter(int side) — возвращает периметр
    //Вызовите оба метода в main с примером.

    public static double squareArea(int side) {
        return (double) side * side;
    }

    public static double squarePerimeter(int side) {
        return (double) side * 4;
    }

    //5. Метод для перевода секунд в минуты
    //Условие:
    //Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
    //Вызовите метод в main и выведите результат.

    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    //6. Метод для вычисления средней скорости
    //Условие:
    //Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
    //Вызовите метод с разными значениями.

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    //7. Метод для нахождения гипотенузы
    //Условие:
    //Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
    //√(a² + b²)
    //Вызовите метод с несколькими наборами чисел.

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    //8. Метод для длины окружности
    //Условие:
    //Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
    //Проверьте работу на нескольких значениях.

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //9. Метод для вычисления процентов
    //Условие:
    //Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
    //Пример: 25 из 200 → 12.5%

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    //10. Методы перевода температуры
    //Условие:
    //Создайте два метода:
    //celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
    //fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
    //Проверьте оба метода в main.

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / +32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
