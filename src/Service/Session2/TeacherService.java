package Service.Session2;

public class TeacherService extends PersonService {
    @Override
    public void notification() {
        System.out.println("Send Sms to Teacher");
    }
}
