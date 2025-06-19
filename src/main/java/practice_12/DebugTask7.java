package practice_12;

public class DebugTask7 {
    /**
     * Два потока списывают деньги со счёта одновременно,
     * но почему-то баланс становится отрицательным.
     */
    private static volatile int balance = 100;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> withdraw(60));
        Thread t2 = new Thread(() -> withdraw(50));
        t1.start();
        t2.start();
    }

    public static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            balance -= amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Недостаточно денег для списания.");
        }
    }
}
