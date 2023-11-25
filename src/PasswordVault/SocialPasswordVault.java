package PasswordVault;

import Password.SocialPassword;

public class SocialPasswordVault extends PasswordVault{
    public SocialPasswordVault(){}

    public boolean updatePassword(SocialPassword password, String pass){

        return false;
    }

    public boolean addRecoveryKey(SocialPassword password, String recoveryKey){

        return false;
    }

    public boolean modifyRecoveryKey(SocialPassword password, String recoveryKey){

        return false;
    }
}
