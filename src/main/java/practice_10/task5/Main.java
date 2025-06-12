package practice_10.task5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    //5. Реализация пула потоков для обработки задач
    //Условие задачи:
    //Напишите программу, которая использует ExecutorService для создания пула потоков,
    // в котором несколько потоков обрабатывают задачи. Каждая задача — это выполнение простого теста с задержкой.
    // Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
    // После выполнения всех задач, результат должен быть выведен в главном потоке.

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 20; i++) {
            executorService.execute(new Thread());
        }
        executorService.shutdown();

        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Выполнено 20 задач");
    }
}

class Thread implements Runnable {

    @Override
    public void run() {
        System.out.println(java.lang.Thread.currentThread().getName() + " выполняет задачу");
        try {
            java.lang.Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
