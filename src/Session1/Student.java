package Session1;

public class Student {
    private static int counter = 0;
    private int id = 0;
    private int grade;

    public Student(int grade) {
        id = ++counter;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
