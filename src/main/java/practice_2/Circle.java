package practice_2;

public class Circle {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double calculateCircumference() {
        return 2 * Math.PI * getRadius();
    }
}
