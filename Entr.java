package ProjectB;

import java.io.*;
import java.util.*;

public class Entr {
    
    private static String fullPath = "Y:\\Eclipse JAVA\\ALL\\All_Seminars\\src\\ProjectB\\ALL_managers.txt";
    private static Map<String, String> logPass = new HashMap<>();

   
    public static void welcome() {
        loadLogPass(fullPath);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        
        if (checkLogPass(login, password)) {
        	System.out.println("Вы успешно вошли в систему!");
        	int ars = scanner.nextInt();
        	if(ars==1) {
        		News n = new News();
        		n.CheckNews();
        	}
        	System.out.println("1:Хотите посмотреть новости?");
        	
        } else {
            System.out.println("Неверный логин или пароль.");
        }
        
        scanner.close();
    }
    
   
    public static void loadLogPass(String fullPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String login = parts[0].trim();
                    String password = parts[1].trim();
                    logPass.put(login, password);
                }
            }
        } catch (IOException e) {
            System.out.println("!!!ERROR!!!" + e.getMessage());
        }
    }
    

    public static boolean checkLogPass(String login, String password) {
        if (logPass.containsKey(login)) {
            return logPass.get(login).equals(password);
        }
        return false;
    }
}