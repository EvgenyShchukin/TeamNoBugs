package practice_10.task4;

public class Counter {
    //4. Задача: использование synchronized
    //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. 
    // Создайте два потока, каждый из которых вызывает increment() 1000 раз. 
    // Обеспечьте правильную работу с помощью synchronized.

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static synchronized void increment() {
        count++;
        System.out.println("Счетчик равен: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }
}
