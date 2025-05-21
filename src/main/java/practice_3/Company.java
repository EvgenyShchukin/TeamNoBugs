package practice_3;

public class Company {
    static String companyName = "Gazprom";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }
}
