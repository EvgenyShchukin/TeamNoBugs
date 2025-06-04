package practice_8.generics.dop.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBox<T extends Number>{
    //Ограничение сверху
    //Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.

    private List<T> numbers = new ArrayList<>();

    public NumberBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public <T extends Number> double sum(List<T> list) {
        double sum = 0;
        for (T number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        NumberBox numberBox = new NumberBox<>(Arrays.asList(5, 7.8, 2.4));
        System.out.println(numberBox.sum(numberBox.numbers.stream().toList()));

    }



}
