package Model.Session2;

public class Teacher extends Person {
    @Override
    public void notification() {
        System.out.println("Send Sms to Teacher");
    }
}
