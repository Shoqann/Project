package ProjectB;
import java.io.*;
public class Reg implements Serializable{
	private String login;
    private String password;
	public Reg(String login, String password) {
        this.login=login;
        this.password=password;
        
    }
	 public static Teacher fromString(String line) {
	        // Предположим, строка имеет формат "Имя,Предмет,Возраст"
	        String[] parts = line.split(",");
	        String login = parts[0];
	        String password = parts[1];
	  

	        return new Teacher(login,password,TeacherType.Lector);
	    }
	    @Override
	    public String toString() {
	        return 
	                login + ":" + password;
	               
	    }

}
