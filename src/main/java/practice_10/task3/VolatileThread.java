package practice_10.task3;

public class VolatileThread {
    //3. Задача: использование volatile
    //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
    // В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

    public static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread());
        thread.start();
        Thread.sleep(2000);
        stop = true;
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (!VolatileThread.stop) {
            count++;
            System.out.println("Счетчик равен: " + count);
        }
    }
}
