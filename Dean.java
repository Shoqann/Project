
package ProjectB;

import java.io.Serializable;

public class Dean implements Serializable {
	private String deanLogin;
	private String deanPassword;
   

    public Dean(String login,String Password) {
        this.deanLogin = login;
        this.deanPassword = Password;
        
    }

 

   

    public static Dean fromString(String line) {
        String[] parts = line.split(":");
        String login = parts[0];
        String password = parts[1];
        return new Dean(login,password);
    }

    @Override
    public String toString() {
        return deanLogin +":"+deanPassword;
    }
    
}