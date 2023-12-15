package Database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static  String DB_URL ;
    private static  String DB_USER ;
    private static  String DB_PASSWORD ;
    private volatile static  DatabaseConnection instance ;
    private  static final String confPath = "src/config.properties";
    private static Connection DBConnectionInstance;


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


    public void closeConnection () throws SQLException {
        if (getDBConnectionInstance() != null){
            getDBConnectionInstance().close();
        }

    }
    public Connection getDBConnectionInstance(){
        return DBConnectionInstance;
    }

    private DatabaseConnection (){
        try(FileInputStream confInput = new FileInputStream(confPath);) {
            Properties conf = new Properties();
            conf.load(confInput);
            DB_URL = conf.getProperty("DB_URL");
            DB_USER = conf.getProperty("DB_USER");
            DB_PASSWORD = conf.getProperty("DB_PASSWORD");
            DBConnectionInstance = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
