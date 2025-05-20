package practice_2;

public class Product {
    String name = "Milk";
    double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(int discount) {
        double discountAmount = price * ((double) discount / 100);
        return price -= discountAmount;
    }

    public void printInfo() {
        System.out.println("Товар: " + this.name + ", Цена: " + this.price);
    }
}
