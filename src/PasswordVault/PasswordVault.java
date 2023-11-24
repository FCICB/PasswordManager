package PasswordVault;

import EmailNotification.EmailNotifier;
import Encryption.Encryption;
import Password.Password;

import java.util.List;

public abstract class PasswordVault {
    private List<Password> data;
    private Encryption encryption;
    private EmailNotifier emailNotifier;

    public PasswordVault(){}

    public boolean addPassword(Password password){

        return false;
    }

    public boolean deletePassword(String passName){

        return false;
    }

    public boolean updatePassName(Password password, String name){

        return false;
    }

    public boolean updatePassDescription(Password password, String description){

        return false;
    }

    public Password readPassword(String passName){
        return null;
    }

    public List<PasswordVault> retrieveVault(int userId){
        return null;
    }
}
