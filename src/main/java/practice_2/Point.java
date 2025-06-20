package practice_2;

public class Point {
    private int x;
    private int y = 5;

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
        System.out.println("Координаты: x = " + getX() + ", y = " + this.y);
    }
}
