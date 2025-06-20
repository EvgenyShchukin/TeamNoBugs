package practice_2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2008);
        car.print();
        car.setYear(2021);
        car.print();

        System.out.println("----------------------------------------------");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Старая площадь ровна: " + rectangle.calculateArea());
        rectangle.setWidth(4);
        System.out.println("Новая площадь ровна: " + rectangle.calculateArea());

        System.out.println("----------------------------------------------");

        Book book = new Book("Мертвые души", "Гоголь");
        book.printInfo();
        book.setAuthor("Николай Гоголь");
        book.printInfo();

        System.out.println("----------------------------------------------");

        BankAccount bankAccount = new BankAccount("Иванов", 120);
        bankAccount.deposit(55.20);
        bankAccount.withdraw(21.10);
        bankAccount.printBalance();

        System.out.println("----------------------------------------------");

        Point point = new Point(4);
        point.print();
        point.setX(5);
        point.print();

        System.out.println("----------------------------------------------");

        StudentGroup studentGroup = new StudentGroup("Первые", 14);
        studentGroup.printInfo();
        studentGroup.setStudentCount(17);
        studentGroup.printInfo();

        System.out.println("----------------------------------------------");

        Circle circle = new Circle(6);
        System.out.println("Площадь окружности ровна: " + circle.calculateArea());
        System.out.println("Длина окружности ровна: " + circle.calculateCircumference());
        circle.setRadius(5);
        System.out.println("Площадь окружности ровна: " + circle.calculateArea());
        System.out.println("Длина окружности ровна: " + circle.calculateCircumference());

        System.out.println("----------------------------------------------");

        Teacher teacher = new Teacher("Ольга", "история");
        teacher.printInfo();
        teacher.setSubject("химия");
        teacher.printInfo();

        System.out.println("----------------------------------------------");

        Product product = new Product("Молоко", 75);
        product.printInfo();
        product.applyDiscount(20);
        product.printInfo();

        System.out.println("----------------------------------------------");

        Laptop laptop = new Laptop("Lenovo", 47000);
        laptop.printInfo();
        laptop.setPrice(25000);
        laptop.printInfo();
    }


}
