import Session1.BankAccount;
import Session1.ArrowSwitch;
import Session1.YieldSwitch;
import Session1.Grade;
import Session1.Student;
import Session1.Matrix;
import Session2.*;
import Tasks.DuplicateDetectorTask;
import lib.Myprintln;

public class Main {

    public static void session_1(){
        // Convert Grades from 0-100 format into A-F format
        Grade g = new Grade();
        Myprintln.println(g.convert_grades(99));

        // arrow switch example to detect gender base on name given
        ArrowSwitch As = new ArrowSwitch();
        String gender = As.detect_gender("ali");
        Myprintln.println(gender);

        // yield switch example
        YieldSwitch Ys = new YieldSwitch();
        Myprintln.println(Ys.detect_gender("mary"));

        // create Matrix
        Matrix m = new Matrix(5);
        int[][] mat = m.getMatrix();
        Myprintln.println(mat);

        // array of Students class
        int array_size = 10;
        Student[] st = new Student[array_size];
        for (int i = 0; i < array_size; i++) {
            int grade = (int)(Math.random() * 100);
            st[i] = new Student(grade);
        }

        for (int i = 0; i < array_size; i++) {
            Myprintln.println("id: " + st[i].getId() + "\tGrade: " + st[i].getGrade() + "\tGrade: " + g.convert_grades(st[i].getGrade()));
        }

        // Bank Account
        BankAccount bk = new BankAccount(5660.0);
        bk.deposit(25.5);
        bk.withdraw(25.5);
        Myprintln.println(bk.info());
        Myprintln.println("\nGet Transaction History Separately: " + bk.GetLastTransaction());
    }

    public static void session_2(){
        // Duplicate Detector
        DuplicateDetectorTask ddt = new DuplicateDetectorTask();
        Thread ddtt = new Thread(ddt);
        ddtt.start();

        // Person abstract class with notify and awake methods:
        Thread thread = new Thread(() -> {
            Manager m = new Manager();
            m.notification();
            m.awake();
        });
        thread.start();

        thread = new Thread(() -> {
            Session2.Student st = new Session2.Student();
            st.notification();
            st.awake();
        });
        thread.start();

        thread = new Thread(() -> {
            Teacher t = new Teacher();
            t.notification();
            t.awake();
        });
        thread.start();

        // Shape abstract class
        thread = new Thread(() -> {

            Shape[] shapes = new Shape[2];
            shapes[0] = new Circle();
            shapes[1] = new Square();

            AreaCalculator<Shape> a = new AreaCalculator<>();
            a.add(shapes[0]);
            a.add(shapes[1]);

            a.area();
        });
        thread.start();




    }

    public static void main(String[] args) {
//        session_1();

//        session_2();

//        Graphic g = new Graphic();
//        g.CreateWindow();

        // Shape abstract class
//        Thread thread = new Thread(() -> {
//            Graphic g = new Graphic();
//            g.CreateWindow();
//        });
//        thread.start();

        // Convert Grades from 0-100 format into A-F format
//        Grade g = new Grade(new int[] {10,20,52,13,2,1,9});
//        Myprintln.println( g.sort());
//        Myprintln.println( "\n");
//        Myprintln.println( g.max());
    }
}