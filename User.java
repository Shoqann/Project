package ProjectB;
import java.util.*;
public abstract class User {
    private String login;
    private String password;
    private String fullName;

    
    
    public User(String login, String password, String fullName) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }
    

    public String viewNews() {
        return "Viewing news...";
        
    }

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    

    @Override
    public String toString() {
        return login + ":" + password;
    }
}