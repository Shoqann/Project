package ProjectB;
import java.util.Vector;

public class Course {
    private String name;
    private String code;
    private int credits;
    private Vector<Teacher> teachers = new Vector<>();
    private Vector<Course> prereqs = new Vector<>();
    private String semesterType;

    public Course(String name, String code, int credits, String semesterType) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.semesterType = semesterType;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addPrereq(Course course) {
        prereqs.add(course);
    }

    public void removePrereq(Course course) {
        prereqs.remove(course);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Vector<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Vector<Course> getPrereqs() {
        return prereqs;
    }

    public void setPrereqs(Vector<Course> prereqs) {
        this.prereqs = prereqs;
    }

    public String getSemesterType() {
        return semesterType;
    }

    public void setSemesterType(String semesterType) {
        this.semesterType = semesterType;
    }
}