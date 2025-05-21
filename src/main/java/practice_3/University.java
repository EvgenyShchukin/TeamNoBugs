package practice_3;

public class University {
    static String universityName = "Tgu";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента: " + studentName + ", ID студента: " + studentID + ", Университет: " + universityName);
    }
}
