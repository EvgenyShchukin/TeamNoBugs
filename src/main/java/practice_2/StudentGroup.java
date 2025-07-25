package practice_2;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }


    public void  printInfo() {
        System.out.println("Группа: " + getGroupName() + ", Количество студентов: " + getStudentCount());
    }
}
