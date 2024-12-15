package ProjectB;

import java.io.Serializable;

public class AdminMoments implements Serializable {
    private String login;
    private String password;

    public AdminMoments(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Getters and setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static AdminMoments fromString(String line) {
    	String[] parts = line.split(":");
    	String login = parts[0];
        String password = parts[1];
         
   
        return new AdminMoments(login, password);
    }

    @Override
    public String toString() {
        return login + ":" + password;
    }
}
