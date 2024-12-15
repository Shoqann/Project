package ProjectB;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Manager implements Serializable {
	  private String login;
	    private String password;

	    public Manager(String login, String password) {
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

	    // Метод для чтения объекта Manager из строки
	    public static Manager fromString(String line) {
	        String[] parts = line.split(":");
	        if (parts.length != 2) {
	            throw new IllegalArgumentException("Некорректный формат строки: " + line);
	        }
	        return new Manager(parts[0], parts[1]);
	    }

	    @Override
	    public String toString() {
	        return login + ":" + password;
	    }
	
//    private List<String> requests;
//
//    public Manager(String login, String password, String fullName) {
//        //super(login, password, fullName);
//    }
//
//    public void approveRegistration(Student student, boolean approval) {
//        System.out.println("Registration " + (approval ? "approved" : "rejected") + " for: " + student.getFullName());
//    }
//
//    public void viewInfoStudents(List<Student> students) {
//        students.forEach(student -> System.out.println("Student: " + student.getFullName()));
//    }
//
//    // Getters and setters
//    public List<String> getRequests() {
//        return requests;
//    }
//
//    public void setRequests(List<String> requests) {
//        this.requests = requests;
//    }
}