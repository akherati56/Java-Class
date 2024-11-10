import Service.Session1.BankAccountService;
import Service.Session1.ArrowSwitchService;
import Service.Session1.YieldSwitchService;
import Service.Session1.GradeService;
import Service.Session1.StudentService;
import Service.Session1.MatrixService;
import Service.Session2.*;
import Service.Session3.BankAccount;
import Tasks.DuplicateDetectorTask;
import Vendor.Myprintln;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void session_1() {
        // Convert Grades from 0-100 format into A-F format
        GradeService g = new GradeService();
        Myprintln.println(g.convert_grades(99));

        // arrow switch example to detect gender base on name given
        ArrowSwitchService As = new ArrowSwitchService();
        String gender = As.detect_gender("ali");
        Myprintln.println(gender);

        // yield switch example
        YieldSwitchService Ys = new YieldSwitchService();
        Myprintln.println(Ys.detect_gender("mary"));

        // create Matrix
        MatrixService m = new MatrixService(5);
        int[][] mat = m.getMatrix();
        Myprintln.println(mat);

        // array of Students class
        int array_size = 10;
        StudentService[] st = new StudentService[array_size];
        for (int i = 0; i < array_size; i++) {
            int grade = (int) (Math.random() * 100);
            st[i] = new StudentService(grade);
        }

        for (int i = 0; i < array_size; i++) {
            Myprintln.println("id: " + st[i].getId() + "\tGrade: " + st[i].getGrade() + "\tGrade: " + g.convert_grades(st[i].getGrade()));
        }

        // Bank Account
        BankAccountService bk = new BankAccountService(5660.0);
        bk.deposit(25.5);
        bk.withdraw(25.5);
        Myprintln.println(bk.info());
        Myprintln.println("\nGet Transaction History Separately: " + bk.GetLastTransaction());
    }

    public static void session_2() {
        // Duplicate Detector
        DuplicateDetectorTask ddt = new DuplicateDetectorTask();
        Thread ddtt = new Thread(ddt);
        ddtt.start();

        // Person abstract class with notify and awake methods:
        Thread thread = new Thread(() -> {
            ManagerService m = new ManagerService();
            m.notification();
            m.awake();
        });
        thread.start();

        thread = new Thread(() -> {
            Service.Session2.StudentService st = new Service.Session2.StudentService();
            st.notification();
            st.awake();
        });
        thread.start();

        thread = new Thread(() -> {
            TeacherService t = new TeacherService();
            t.notification();
            t.awake();
        });
        thread.start();

        // Shape abstract class
        thread = new Thread(() -> {

            ShapeService[] shapes = new ShapeService[2];
            shapes[0] = new CircleService();
            shapes[1] = new SquareService();

            AreaCalculatorService<ShapeService> a = new AreaCalculatorService<>();
            a.add(shapes[0]);
            a.add(shapes[1]);

            a.area();
        });
        thread.start();


    }

    public static void session_3() {

        // Accounts as list
        List<BankAccount> accounts = new ArrayList<>(List.of(
                new BankAccount("tehran", "ali", 50000.0),
                new BankAccount("tokyo", "hasan", 200.0),
                new BankAccount("london", "james", 9000.0),
                new BankAccount("tokyo", "kate", 120000.0)
        ));

        // Map of <branch, accounts>
        Map<String, List<BankAccount>> branchMap = new HashMap<>();

        for (BankAccount account : accounts) {
            String branch = account.getBranch();
            if (!branchMap.containsKey(branch)) {
                branchMap.put(branch, new ArrayList<>());
            }
            branchMap.get(branch).add(account);
        }

        // Print branch map
        System.out.println("\nPrint branch map");
        branchMap.forEach((branch, accountList) -> {
            System.out.println("Branch: " + branch + " - Accounts: " + accountList);
        });

        // Sort base on balance
        System.out.println("\nSort base on balance");
        accounts.sort(Comparator.comparingDouble(BankAccount::getBalance));
        accounts.forEach(System.out::println);

        // Reverse sort base on balance
        System.out.println("\nReverse sort base on balance");
        accounts.sort(Comparator.comparingDouble(BankAccount::getBalance).reversed());
        accounts.forEach(System.out::println);

        // Uppercase names
        System.out.println("\nUppercase names");
        accounts.forEach(account -> account.setName(account.getName().toUpperCase()));
        accounts.forEach(System.out::println);


        // Filter accounts with balance > 10 and name starts with "A"
        System.out.println("\nFilter accounts with balance > 10 and name starts with \"A\"");
        List<BankAccount> filteredAccounts = accounts.stream()
                .filter(account -> account.getBalance() > 10 && account.getName().startsWith("A"))
                .toList();
        filteredAccounts.forEach(System.out::println);


        // Filter accounts with branch name starting with "A"
        System.out.println("\nFilter accounts with branch name starting with \"A\"");
        List<BankAccount> filteredAccounts2 = accounts.stream()
                .filter(account -> account.getBranch().startsWith("A"))
                .toList();
        filteredAccounts.forEach(System.out::println);
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


        session_3();
    }
}