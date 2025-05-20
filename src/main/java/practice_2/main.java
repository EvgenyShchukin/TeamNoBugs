package practice_2;

public class main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2001);
        car.print();
        car.setBrand("Lexus");
        car.setYear(2021);
        car.print();
        System.out.println("----------------------------------------");

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Ширина ровна: " + rectangle.width + ", " + "Площадь ровна: " + rectangle.calculateArea());
        rectangle.setWidth(4);
        System.out.println("Ширина ровна: " + rectangle.width + ", " + "Площадь ровна: " + rectangle.calculateArea());
        System.out.println("----------------------------------------");

        Book book = new Book("Война и мир", "Лев Толстой");
        book.printInfo();
        book.setAuthor("Гоголь");
        book.printInfo();
        System.out.println("----------------------------------------");

        BankAccount bankAccount = new BankAccount(100.11);
        bankAccount.printBalance();
        bankAccount.deposit(20);
        bankAccount.printBalance();
        bankAccount.withdraw(10);
        bankAccount.printBalance();
        System.out.println("----------------------------------------");

        Point point = new Point(4);
        point.print();
        point.setX(5);
        point.print();
        System.out.println("----------------------------------------");

        StudentGroup studentGroup = new StudentGroup("Beta", 12);
        studentGroup.printInfo();
        studentGroup.setStudentCount(15);
        studentGroup.printInfo();
        System.out.println("----------------------------------------");

        Circle circle = new Circle(5);
        System.out.println("Площадь ровна: " + circle.calculateArea());
        System.out.println("Длина окружности ровна: " + circle.calculateCircumference());
        circle.setRadius(7);
        System.out.println("Площадь ровна: " + circle.calculateArea());
        System.out.println("Длина окружности ровна: " + circle.calculateCircumference());
        System.out.println("----------------------------------------");

        Teacher teacher = new Teacher("Ivan", "history");
        teacher.printInfo();
        teacher.setName("Igor");
        teacher.setSubject("English");
        teacher.printInfo();
        System.out.println("----------------------------------------");

        Product product = new Product(50);
        product.printInfo();
        product.applyDiscount(10);
        product.printInfo();
        System.out.println("----------------------------------------");

        Laptop laptop = new Laptop("Lenovo", 45000);
        laptop.printInfo();
        laptop.setPrice(42000);
        laptop.printInfo();

    }
}
