package practice_10.task6;

import java.util.ArrayList;

public class Main {
    //6. Параллельная обработка данных с использованием потоков
    //Условие задачи:
    //Напишите программу, которая создает 3 потока для обработки элементов в списке.
    // Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
    // После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.

    static ArrayList<Integer> arrays = new ArrayList<>();
    static volatile int sum = 0;


    public static void main(String[] args) throws InterruptedException {
        arrays.add(4);
        arrays.add(2);
        arrays.add(6);
        arrays.add(21);
        arrays.add(4);
        arrays.add(7);
        arrays.add(11);
        arrays.add(22);
        arrays.add(15);
        arrays.add(19);


        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());
        Thread threadC = new Thread(new ThreadC());

        threadA.start();
        threadB.start();
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();

        System.out.println("Обработано 9 элементов");
        System.out.println("Сумма ровна: " + sum);
    }
}

class ThreadA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Main.sum += Main.arrays.get(i);
            System.out.println("Индекс равен: " + i + " Значение равно: " + Main.arrays.get(i));
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 3; i < 7; i++) {
            Main.sum += Main.arrays.get(i);
            System.out.println("Индекс равен: " + i + " Значение равно: " + Main.arrays.get(i));
        }
    }
}

class ThreadC implements Runnable {
    @Override
    public void run() {
        for (int i = 6; i < 9; i++) {
            Main.sum += Main.arrays.get(i);
            System.out.println("Индекс равен: " + i + " Значение равно: " + Main.arrays.get(i));
        }
    }
}
