package practice_2;

public class Point {
    int x;
    int y = 6;

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("x равен: " + this.x + ", y равен: " + this.y);
    }
}
