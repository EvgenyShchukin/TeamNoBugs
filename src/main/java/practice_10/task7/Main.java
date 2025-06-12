package practice_10.task7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    //7. Реализация блокировки с использованием ReentrantLock
    //Условие задачи:
    //Напишите программу, которая моделирует работу банковского счета с несколькими потоками.
    // Каждый поток должен попытаться перевести деньги с одного счета на другой.
    // Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Client("55555", lock);
        new Client("55555", lock);
        new Client("55555", lock);

        System.out.println("Все операции завершены!");
    }
}

class Client extends Thread {
    String cardNumber;
    Lock lock;

    public Client(String cardNumber, Lock lock) {
        this.cardNumber = cardNumber;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("Происходит перевод денег");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("Деньги успешно переведены");
        }
    }
}

