package User;

import Database.DatabaseFunctions;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class RegularUser extends User  {
    public Boolean updateEmail (String Email){
        return true;

    }

    public Boolean updatePassword(String password){

        return true;
    }

    public Boolean modifyMail(String mail){
        return true;
    }

    public Boolean modifyPassword(String pass){
        return true;
    }

    public Boolean modifyUserName(String userName){
        return true;
    }











    /**
     *
     * -ModifyUserName(String name)
     * -ModifyMail(String mail)
     * -ModifyPassowrd(String password)
     */





}
