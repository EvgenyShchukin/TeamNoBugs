package practice_2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(int discount) {
        double discountAmount = getPrice() * ((double) discount / 100);
        return price -= discountAmount;
    }

    public void printInfo() {
        System.out.println("Товар: " + getName() + ", Цена: " + getPrice());
    }
}
