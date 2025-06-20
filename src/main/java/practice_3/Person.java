package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + getFirstName() + ", Фамилия: " + getLastName() + ", SSN: " + getSsn());
    }

    public static void main(String[] args) {
        Person person1  = new Person("Иван", "Иванов" , "123-45-6789");
        Person person2  = new Person("Петр", "Петров" , "555-66-6789");
        Person person3  = new Person("Семен", "Семенов" , "777-88-6789");

        person3.setFirstName("Semen");
        person3.setLastName("Semenov");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
