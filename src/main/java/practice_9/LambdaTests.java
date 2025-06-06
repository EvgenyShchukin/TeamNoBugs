package practice_9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTests {
    public static void main(String[] args) {
        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.

        Predicate<Integer> isVen = number -> number % 2 == 0;
        System.out.println("Четное число 4: " + isVen.test(4));
        System.out.println("Нечетное число 11: " + isVen.test(11));

        System.out.println("------------------------------------------");

        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.

        Function<String, Integer> function = s -> s.length();
        System.out.println("Длина строки: " + function.apply("Тестирование"));

        System.out.println("------------------------------------------");

        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Test Consumer");
    }
}
