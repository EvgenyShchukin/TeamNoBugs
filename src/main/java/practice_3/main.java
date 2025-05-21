package practice_3;

public class main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Sergey");
        Company employee2 = new Company(2, "Elena");

        Company.printCompanyName();
        Company.companyName = "Elke";
        Company.printCompanyName();

        //  employee1.employeeID = 10; --- Ошибка

        System.out.println("-------------------------------------------");

        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(10));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(10));
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(15));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(15));
        System.out.println("-------------------------------------------");

        LibraryTest.library();
        System.out.println("-------------------------------------------");

        University student1 = new University(1, "Anna");
        University student2 = new University(2, "Oleg");
        University student3 = new University(3, "Semen");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.universityName = "Tusur";
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        System.out.println("-------------------------------------------");

        GameSettings game1 = new GameSettings("Футбол", 21);
        GameSettings game2 = new GameSettings("Баскетболл", 18);
        game1.printGameStatus();
        game2.printGameStatus();
        GameSettings.setMaxPlayers(24);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();
        System.out.println("-------------------------------------------");

        Person person1 = new Person("Иван", "Иванов", "123-45-6789");
        Person person2 = new Person("Сергей", "Сергеев", "123-77-9999");
        person1.printPersonInfo();
        person2.printPersonInfo();
        person1.setFirstName("Арсен");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
