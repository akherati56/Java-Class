import Session1.BankAccount;
import Session1.ArrowSwitch;
import Session1.YieldSwitch;
import Session1.Grade;
import Session1.Student;
import Session1.Matrix;
import Session2.DuplicateDetector;
import Session2.Manager;
import Session2.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void println(String Message){
        System.out.println(Message);
    }

    public static void println(int Message){
        System.out.println(Message);
    }

    public static void println(ArrayList<String> Message){
        System.out.println(Message);
    }

    public static void println(int[][] matrix){
        for (int[] ints : matrix) {
            System.out.print("\n");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        println("\n");
    }

    public static void session_1(){
        // Convert Grades from 0-100 format into A-F format
        Grade g = new Grade();
        println(g.convert_grades(99));

        // arrow switch example to detect gender base on name given
        ArrowSwitch As = new ArrowSwitch();
        String gender = As.detect_gender("ali");
        println(gender);

        // yield switch example
        YieldSwitch Ys = new YieldSwitch();
        println(Ys.detect_gender("mary"));

        // create Matrix
        Matrix m = new Matrix(5);
        int[][] mat = m.getMatrix();
        println(mat);

        // array of Students class
        int array_size = 10;
        Student[] st = new Student[array_size];
        for (int i = 0; i < array_size; i++) {
            int grade = (int)(Math.random() * 100);
            st[i] = new Student(grade);
        }

        for (int i = 0; i < array_size; i++) {
            println("id: " + st[i].getId() + "\tGrade: " + st[i].getGrade() + "\tGrade: " + g.convert_grades(st[i].getGrade()));
        }

        // Bank Account
        BankAccount bk = new BankAccount(5660.0);
        bk.deposit(25.5);
        bk.withdraw(25.5);
        println(bk.info());
        println("\nGet Transaction History Separately: " + bk.GetLastTransaction());
    }

    public static void session_2(){
        // Duplicate Detector
        DuplicateDetector d = new DuplicateDetector();
        ArrayList<String> duplicateStrings = d.findDuplicateStrings();
        println(duplicateStrings);

        // Person abstract class with notify and awake methods:
        Manager m = new Manager();
        m.notification();
        m.awake();

        Session2.Student st = new Session2.Student();
        st.notification();
        st.awake();

        Teacher t = new Teacher();
        t.notification();
        t.awake();




    }

    public static void main(String[] args) {
//        session_1();

        session_2();
    }
}