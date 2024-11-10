package DataBase;

import Interface.DataBaseInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlite implements DataBaseInterface {
    private final String URL = "jdbc:sqlite:sample.db"; // Database file path
    private Connection conn;

    public void Sqlite () throws SQLException {
        // Establish connection to SQLite
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                this.conn = conn;
                System.out.println("Connected to SQLite database!");
            }
        }
    }

    public void CreateTable() throws SQLException {
        // Create a new table
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "age INTEGER" +
                ");";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created successfully.");
        }
    }

    public void InsertIntoTable() throws SQLException {
        String sql = "INSERT INTO students (name, age)\n" +
                "VALUES ('Alice', 30);";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Data Inserted successfully.");
        }
    }


}
