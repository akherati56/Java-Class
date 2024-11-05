package Session1;

public class Grade {
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
}
