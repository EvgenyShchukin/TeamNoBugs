package practice_3;

public class University {
    private static String universityName = "TGU";
    private final int studentID;
    private String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ", ID студента: " + this.studentID + ", Университет " + University.universityName);
    }

    public static void main(String[] args) {
        University student1 = new University(1, "Ivan");
        University student2 = new University(2, "Anna");
        University student3 = new University(3, "Petr");

        changeUniversityName("TPU");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
