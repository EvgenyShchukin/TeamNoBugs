package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Учитель: " + this.name + ", Предмет: " + this.subject);
    }
}
