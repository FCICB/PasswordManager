package Database;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import Database.*;
public interface DatabaseFunctions {
        DatabaseConnection connecton = DatabaseConnection.getInstance();
        // Method to select data from the database
         //List<Map<String, Object>> select(String query) throws SQLException;

        // Method to update data in the database
         int update(String query) throws SQLException;

        // Method to delete data from the database
        int delete(String query) throws SQLException;

        Boolean insert (String query) throws SQLException;

}
