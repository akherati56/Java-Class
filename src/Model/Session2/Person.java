package Model.Session2;

public abstract class Person {
    protected String name;

    abstract void notification();

    public void awake(){
        System.out.println("Awake");
    }
}
