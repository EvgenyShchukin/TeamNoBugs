package practice_3;

import static practice_3.Company.printCompanyName;

public class Company {
    public static String companyName = "Азбука";
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

    class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Anna");
        Company employee3 = new Company(3, "Semen");

        printCompanyName();

        Company.companyName = "Мозайка";
        printCompanyName();
    }
}
