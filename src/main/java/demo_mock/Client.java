package demo_mock;

public class Client {
    private String name;
    private int age;
    private boolean isAlive;
    private static int clientCount;

    public Client() {
        clientCount++;
    }

    public Client(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        clientCount++;
    }

    public static void main(String[] args) {
        Client client1 = new Client("Sergey", 18, true);
        Client client2 = new Client("Anna", 22, false);
        Client client3 = new Client();

        System.out.println(clientCount);
    }
}
