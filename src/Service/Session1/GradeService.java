package Service.Session1;

import java.util.Arrays;

public class GradeService {

    private int[] grades;
    public String convert_grades(int grade){
        if (grade > 100 | grade < 0) {
            throw new IllegalArgumentException("Invalid grade");
        }
        grade = grade / 10;
        return switch (grade) {
            case 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5 -> "E";
            default -> "F";
        };
    }

    public GradeService(){
        // pass
    }

    public GradeService(int[] grades){
        this.grades = grades;
    }

    public int[] sort() {
        Arrays.sort(grades);
        return grades;
    }

    public int max(){
        int max = grades[0];
        for (int grade : grades) {
            if (max < grade) {
                max = grade;
            }
        }
        return max;
    }


}
