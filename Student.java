package ProjectB;
import java.util.HashMap;
import java.util.Map;

public class Student extends User {
    private String id;
    private int yearOfStudy;
    private Map<String, Float> marks = new HashMap<>();
    private Map<String, Integer> retakes = new HashMap<>();
    private int limitCredits;
    private int currentCredits;
    private boolean registrations;
    private int studentOrganization;

    public Student(String login, String password, String fullName, String id, int yearOfStudy) {
        super(login, password, fullName);
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }

    public String viewInfo() {
        return "Student Info: " + getFullName();
    }

    public String viewCourses() {
        return "Courses: List displayed.";
    }

    public String viewTeachers() {
        return "Teachers: List displayed.";
    }

    public float getTranscript() {
        return marks.values().stream().reduce(0f, Float::sum);
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Map<String, Float> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Float> marks) {
        this.marks = marks;
    }

    public Map<String, Integer> getRetakes() {
        return retakes;
    }

    public void setRetakes(Map<String, Integer> retakes) {
        this.retakes = retakes;
    }

    public int getLimitCredits() {
        return limitCredits;
    }

    public void setLimitCredits(int limitCredits) {
        this.limitCredits = limitCredits;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }

    public void setCurrentCredits(int currentCredits) {
        this.currentCredits = currentCredits;
    }

    public boolean isRegistrations() {
        return registrations;
    }

    public void setRegistrations(boolean registrations) {
        this.registrations = registrations;
    }

    public int getStudentOrganization() {
        return studentOrganization;
    }

    public void setStudentOrganization(int studentOrganization) {
        this.studentOrganization = studentOrganization;
    }
}