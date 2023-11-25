package PasswordVault;

import Password.FinancePassword;
import java.time.LocalDateTime;

import java.util.Date;

public class FinancePasswordVault extends PasswordVault{
    public FinancePasswordVault(){}

    public boolean updateCardId(FinancePassword password, String cardId){

        return false;
    }

    public boolean updateExpiryDate(FinancePassword password, LocalDateTime expiryDate){

        return false;
    }

    public boolean updatePassword(FinancePassword financePassword, String password){

        return false;
    }
}
