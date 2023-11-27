package Database;

public class DatabaseConnection {
    private static final String DB_URL = " ";
    private static final String DB_USER=  " " ;
    private static final String DB_PASSWORD = " ";
    private volatile static  DatabaseConnection instance ;


    public static  DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
            }
        return instance;
    }


    public void closeConnection (){
        //close the connection f the database

    }

    private DatabaseConnection (){
        // Initialize the database connection

    }


}