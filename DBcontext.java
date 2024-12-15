package ProjectB;
import java.util.*;
import java.io.*;


public class DBcontext {
	private static String fullPath = "Y:\\Eclipse JAVA\\ALL\\All_Seminars\\src\\ProjectB\\";
	private static DBcontext db = new DBcontext();
	public static Vector<Teacher> teachers = new Vector<>();
	public static List<Student> students = new ArrayList<>();
	public static List<AdminMoments> admins = new ArrayList<>();
	 public static List<Manager> managers = new ArrayList<>();
	 public static List<Dean> deans = new ArrayList<>();
	private DBcontext() {
		
	}
	
	
	
	public static void saveAdmin(List<AdminMoments> admins) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ListAdmins.txt",true))) {
            for (AdminMoments admin : admins) {
                writer.write(admin.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении админов: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ALL_login.txt",true))) {
            for (AdminMoments admin : admins) {
                writer.write(admin.toString()+":"+"Admin");
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении админов: " + e.getMessage());
        }
    }

    
    public static List<AdminMoments> loadAdmin() {
        List<AdminMoments> admins = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath + "ListAdmins.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                admins.add(AdminMoments.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке админов: " + e.getMessage());
        }
        return admins;
    }
	

    
	public static void saveManager(List<Manager> managers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ALL_managers.txt",true))) {
            for (Manager manager : managers) {
                writer.write(manager.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении менеджеров: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ALL_login.txt", true))) {
        	for (Manager manager : managers) {
                writer.write(manager.toString()+":"+"Manager");
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении менеджера: " + e.getMessage());
        }
    }

    
    public static List<Manager> loadManager() {
        List<Manager> managers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath + "ALL_managers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                managers.add(Manager.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке менеджеров: " + e.getMessage());
        }
        return managers;
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

    public static void saveDean(List<Dean> deans) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ListDeans.txt", true))) {
            for (Dean dean : deans) {
                writer.write(dean.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении деканов: " + e.getMessage());
        }
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath + "ALL_login.txt", true))) {
            for (Dean dean : deans) {
                writer.write(dean.toString()+":"+"Dean");
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении деканов: " + e.getMessage());
        }
    }
    

    public static List<Dean> loadDean() {
        List<Dean> deans = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath + "ListDeans.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                deans.add(Dean.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке деканов: " + e.getMessage());
        }
        return deans;
    }
}
	
