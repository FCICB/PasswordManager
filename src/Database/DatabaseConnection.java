package Database;

public class DatabaseConnection {
    private static final String DB_URL = " ";
    private static final String DB_USER=  " " ;
    private static final String DB_PASSWORD = " ";


    private static DatabaseConnection instance = null;

    private DatabaseConnection (){
        // Initialize the database connection

    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }


    public void closeConnection (){
        //close the connection f the database

    }


}
