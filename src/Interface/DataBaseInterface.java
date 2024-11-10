package Interface;

import java.sql.SQLException;

public interface DataBaseInterface {
    public void CreateTable() throws SQLException;
    public void InsertIntoTable() throws SQLException;
}
