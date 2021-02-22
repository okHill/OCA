package PasswordValidator;

import java.util.regex.Pattern;

public class Validator {

    private Pattern pattern;
    private final static String PasswordValid = "((?=.*\\d) (?=.*[a-z]) (?=.*[A-Z]) (?=.*[@#$%]).{6,20})";


    public Validator() {

        pattern = Pattern.compile(PasswordValid);
    }

    public boolean validate(String password) {
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String pw = "Mevlut123@";
        Validator password = new Validator();
        System.out.println(password.validate(pw));
    }
}