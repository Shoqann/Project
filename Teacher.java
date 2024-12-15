package ProjectB;
import java.io.*;
import java.util.Vector;

public class Teacher implements Serializable{
    private Vector<String> courses = new Vector<>();
    private String login;
    private String password;
    private TeacherType type;


    public Teacher(String login, String password, TeacherType type) {
       this.login=login;
       this.password=password;
        this.type = type;
    }

    public void manageCourse(String course) {
        courses.add(course);
        System.out.println("Managing course: " + course);
    }

    public void viewLessonStudents(String lesson) {
        System.out.println("Viewing students in lesson: " + lesson);
    }

    public void putMark(String student, int mark) {
        System.out.println("Marking student " + student + " with " + mark);
    }

    // Getters and setters
    public Vector<String> getCourses() {
        return courses;
    }

    public void setCourses(Vector<String> courses) {
        this.courses = courses;
    }

    public TeacherType getType() {
        return type;
    }

    public void setType(TeacherType type) {
        this.type = type;
    }
	 /*public static Teacher fromString(String line) {
	        
	        String[] parts = line.split(",");
	        String login = parts[0];
	        String password = parts[1];
	        TeacherType type = TeacherType.valueOf(parts[2]);
	  

	        return new Teacher(login,password, type);
	        }
	        */
    public static Teacher fromString(String line) {
        String[] parts = line.split(":");
 
        
        String login = parts[0];
        String password = parts[1];
        TeacherType type = TeacherType.valueOf(parts[2]); 
   
        return new Teacher(login, password, type);
    }

	    @Override
	    public String toString() {
	        return 
	                login + ":" + password + ":" + type;
	               
	    }
   

}