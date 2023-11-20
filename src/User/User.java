package User;

import Database.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract class User {
    private String userName;
    private String userPassword;
    private String userEmail;
    private Boolean role;
    private int userID;


    public String getUserName() {
        //return name from database

        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {

        return userEmail;
    }

    public Boolean getRole() {
        return role;
    }

    public int getUserID() {
        return userID;
    }

    protected void setUserName(String name){

    }

    protected void setUserID(int ID){

    }

    protected void setUserEmail(){

    }

    protected void viewInfo(){

    }

    public Boolean deleteAccunt(int id ){
        return true;
    }


}
