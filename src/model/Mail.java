package model;

import java.util.regex.Pattern;

public class Mail {
    
    private final String email;

    public Mail(String email){
        this.email = email;
    }

    public String getDomain() {
        if (!isEmail()) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        String[] parts = email.split("@");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        return parts[1];
    }
    
    public boolean isEmail(){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        return pattern.matcher(email).matches();
    } 
}