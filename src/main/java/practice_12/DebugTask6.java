package practice_12;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }

    public static void countdown(int n) {
        for (int i = n; i != 0; i--) {
            System.out.println(i);
        }
    }
}
