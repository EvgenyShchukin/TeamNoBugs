package practice_8.generics.task2;


public class TArray {
    public static void main(String[] args) {
        String [] array = new String[5];
        array[0] = "один";
        array[1] = "два";
        array[2] = "три";
        array[3] = "четыре";
        array[4] = "пять";

        printArray(array);
    }

    //Задача на дженерик метод
    //Условие задачи: Напишите дженерик метод printArray,
    // который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.

    public static <T> void printArray(T[] array) {
        for (T text : array) {
            System.out.println("Элемент массива: " + text);
        }

    }
}
