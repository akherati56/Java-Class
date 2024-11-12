package Service.Session4.DataBase;

public class DataBase {

    private DataBase db;
    private String tableName;

    public DataBase(){
        tableName = "";
    }

    public DataBase CreateDB(){
        db = new DataBase();
        return db;
    }

    public String testconnection(){
        return "connected";
    }
}
