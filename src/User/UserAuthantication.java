package User;

public class UserAuthantication {

    private User user;
    public Boolean registerUser( String name,String pass, String email ){
        //checkStrengthPass(pass);
        return true;

    }

    public Boolean logIn (Boolean role, String email, String pass){
        return true;
    }

    private Character getRandomChar(){
        //randomization
        return ' ';
    }

    private String generatePasswords(int length){
        //getRandomChar();
        return " ";

    }

    private Boolean checkStrengthPass(String Pass){
        return true;
    }

    private String hashing (String pass){
        return null;
    }
}
