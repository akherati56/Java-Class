package Service.Session2;

public class StudentService extends PersonService {

    @Override
    public void notification() {
        System.out.println("Call to Student");
    }
}
