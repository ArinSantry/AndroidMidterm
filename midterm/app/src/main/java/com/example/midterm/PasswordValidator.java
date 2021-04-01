package com.example.midterm;

public class PasswordValidator {
    public boolean doPasswordsMatch(String password1, String password2)
    {
        if (password1.equals(password2))
            return true;
        else
            return false;
    }
}
