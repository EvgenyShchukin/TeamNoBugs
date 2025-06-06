package practice_9;

public class MainForMathOperation {
    public static void main(String[] args) {
        //1. Создайте свой функциональный интерфейс
        //Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        // Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.

        MathOperation add = (x,y) -> x + y;
        MathOperation divide = (x,y) -> x / y;
        MathOperation subtract = (x,y) -> x - y;
        MathOperation multiply = (x,y) -> x * y;

        System.out.println("Результат сложения: " + add.apply(4, 9));
        System.out.println("Результат деления: " + divide.apply(12, 3));
        System.out.println("Результат вычитания: " + subtract.apply(14, 9));
        System.out.println("Результат умножения: " + multiply.apply(2, 9));
    }
}
