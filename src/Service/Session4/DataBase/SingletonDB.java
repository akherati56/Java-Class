package Service.Session4.DataBase;

public class SingletonDB {

    private static DataBase db;

    private SingletonDB() {

    }

    public static DataBase getInstance() {
        if (db == null) {
            db = new DataBase();
        }
        return db;
    }
}
