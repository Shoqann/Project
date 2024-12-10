package ProjectB;
import java.util.*;
import java.io.*;


public class DBcontext {
	private static String fullPath = "Y:\\Eclipse JAVA\\ALL\\All_Seminars\\src\\ProjectB\\";
	private static DBcontext db = new DBcontext();
	public static Vector<Teacher> teachers = new Vector<>();
	public static List<Teacher> admins = new ArrayList<>();
	private DBcontext() {
		
	}
	
	public static Vector<Teacher> getTeachers(){
		Object o = ReaderWriter.deserialize(fullPath+"ALL_login.txt");
		if( o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return null;
	}
	
	
	public static void saveTeacher(List<Teacher> teachers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath+"ALL_login.txt", true))) {
            for (Teacher teacher : teachers) {
                writer.write(teacher.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении учителей: " + e.getMessage());
        }
    }
	
	
	public static List<Teacher> loadTeacher() {
        List<Teacher> Teachers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath+"ALL_login.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Teachers.add(Teacher.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке учителей: " + e.getMessage());
        }
        return Teachers;
    }
}
	

