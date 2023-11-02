public class SocialPassword extends Password {
    private String[] recoveryKeys;
    private String password;



    public String[] getRecoveryKeys() {
        return recoveryKeys;
    }

    public void setRecoveryKeys(String[] recoveryKeys) {
        this.recoveryKeys = recoveryKeys;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
