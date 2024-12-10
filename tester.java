package ProjectB;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class tester {
static Scanner sc = new Scanner(System.in);
	
	public static void welcome() {
		
		System.out.println("Welcome to WSP!\nPlease choose the language:");
		System.out.println("Добро пожаловать в WSP!\nПожалуйста выберите язык:");
		System.out.println("WSP-ке қош келдіңіз!\nТілді таңдаңыз:");
		System.out.println("1 KAZ / КАЗ");
		System.out.println("2 RUS / РУСС");
		System.out.println("3 ENG / АНГЛ");
		
		int option = sc.nextInt();
		
		if (option == 1) {
			
			System.out.println("Сіз орыс тілін таңдадыңыз");
			System.out.println("Сен кімсің?");
			System.out.println("1: Жұмысшы");
			System.out.println("2: Пайдаланушы");
			System.out.println("3: Студент");
			
			
			
		} 
		else if(option == 2) {
			
			System.out.println("Вы выбрали Русский");
			System.out.println("Кто вы?");
			System.out.println("1: Работник");
			System.out.println("2: Пользователь");
			System.out.println("3: Студент");
			System.out.println("---------------------");
			System.out.println("4:Все учителя");
			int WhoAreYou = sc.nextInt();
			if(WhoAreYou == 1) {
				System.out.println("Какой вы работник?");
				System.out.println("1:Деканат");
				System.out.println("2:Админ");
				System.out.println("3:Менеджер");
				System.out.println("4:Финансовый Менеджер");
				System.out.println("5:Учитель");
				int EmployeeMoments = sc.nextInt();
				if(EmployeeMoments == 1) {
									
								}
				if(EmployeeMoments == 2) {
					
				}
				if(EmployeeMoments == 3) {
					
				}
				if(EmployeeMoments == 4) {
					
				}
				if(EmployeeMoments == 5) {
					System.out.println("Какой учитель?");
					System.out.println("1. Лектор");
					
					int WhichTeacherType = sc.nextInt();
						if (WhichTeacherType==1) {
							
							createTeacherLector();
						}
				}
			}
			else if(WhoAreYou == 2) {
				createUser();
			}
			else if(WhoAreYou == 3) {
				createUser();
			}
			else if(WhoAreYou == 4) {
				showTeachers();
			}
			
			
			
		}
		else if (option == 3) {
			
			System.out.println("You choose English");
			System.out.println("1: Employee");
			System.out.println("2: User");
			System.out.println("3: Student");
			int WhoAreYou = sc.nextInt();
		}
		
		
		
		

	}
	public static void createUser() {
		sc.nextLine();
		System.out.println("Введи Логин:");
		String Userlogin = sc.nextLine();
		System.out.println("Введи Пароль:");
		String UserPassword = sc.nextLine();
		
		boolean UserRes = Controller.User(Userlogin, UserPassword);
		if (UserRes) {
			System.out.println("Вы создали нового юзера");
		}
		
		
	}
	public static void showTeachers() {
		List<Teacher> loadedTeachers = DBcontext.loadTeachers();
		  
		  System.out.println("Загруженные учителя:");
	       for (Teacher teacher : loadedTeachers) {
	           System.out.println(teacher);
	       
		  }
	}
	public static void createTeacherLector(){
		sc.nextLine();
		System.out.println("Введите Логин:");
		String Teacherlogin = sc.nextLine();
		System.out.println("Введите Пароль:");
		String TeacherPassword = sc.nextLine();
		Teacher newTeacher = new Teacher(Teacherlogin,TeacherPassword,TeacherType.Lector);
		if(DBcontext.teachers == null) {
			DBcontext.teachers = new Vector<>();
		}
		DBcontext.teachers.add(newTeacher);
		//DBcontext.SaveTeachers();
		
		
		 DBcontext.saveTeachers(DBcontext.teachers);

		 System.out.println("У вас успешно создался учитель");

	  
	     
	    }
	
	public static void main(String[] args) {
		
		welcome();
	}
}
