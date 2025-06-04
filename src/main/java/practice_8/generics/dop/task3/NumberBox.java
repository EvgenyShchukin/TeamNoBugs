package practice_8.generics.dop.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBox<T extends Number> {
    //Работа с числами
    //Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.

    private List<T> numbers = new ArrayList<>();

    public NumberBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public double getSum (List<T> numbers) {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        NumberBox numberBox = new NumberBox<>(Arrays.asList(5, 7.8, 2.4));
        System.out.println(numberBox.getSum(numberBox.numbers.stream().toList()));

    }



}
