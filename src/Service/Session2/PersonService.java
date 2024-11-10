package Service.Session2;

public abstract class PersonService {
    protected String name;

    abstract void notification();

    public void awake(){
        System.out.println("Awake");
    }
}
