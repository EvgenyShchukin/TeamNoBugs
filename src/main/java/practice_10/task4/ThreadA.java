package practice_10.task4;

public class ThreadA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.increment();
        }
    }
}
