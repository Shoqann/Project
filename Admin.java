package ProjectB;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.io.Serializable;

public class Admin{
	
static Scanner sc = new Scanner(System.in);
	
	public static void registration() {
		
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
			System.out.println("Кем вы хотите быть?");
			System.out.println("---------------------");
			System.out.println("1: Работник");
			System.out.println("2: Пользователь");
			System.out.println("3: Студент");
			System.out.println("---------------------");
			int WhoAreYou = sc.nextInt();
			if(WhoAreYou == 1) {
				System.out.println("На какую должность вы пришли?");
				System.out.println("1:Декан");
				System.out.println("2:Админ");
				System.out.println("3:Менеджер");
				System.out.println("4:Финансовый Менеджер");
				System.out.println("5:Учитель");
				int EmployeeMoments = sc.nextInt();
				if(EmployeeMoments == 1) {
					createDean();
				}
				else if(EmployeeMoments == 2) {
					createAdmin();
				}
				else if(EmployeeMoments == 3) {
					createManager();
				}
				else if(EmployeeMoments == 4) {
					
				}
				else if(EmployeeMoments == 5) {
					System.out.println("Какой учитель?");
					System.out.println("1. Лектор");
					System.out.println("2. Сеньор-Лектор");
					System.out.println("3. Профессор");
					
					int WhichTeacherType = sc.nextInt();
					if (WhichTeacherType==1) {
						
						createTeacherLector();
					}
					
					else if (WhichTeacherType==2) {
						
						createTeacherSenior();
					}
					else if (WhichTeacherType==3) {
						
						createTeacherProfessor();
					}
					else {
						System.out.println("Таких нет");
					}
				}
				else {
					System.out.println("Начни заново и выбери в промежутке 1-5");
				}
			}
			else if(WhoAreYou == 2) {
				createUser();
			}
			else if(WhoAreYou == 3) {
				createUser();
			}
			else if(WhoAreYou == 4) {
				showLogins();
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
	public static void showLogins() {
		List<Teacher> loadedTeachers = DBcontext.loadTeacher();
		  
		  System.out.println("Загруженные учителя:");
	       for (Teacher reg : loadedTeachers) {
	           System.out.println(reg);
	       
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
		
		
		 DBcontext.saveTeacher(DBcontext.teachers);

		 System.out.println("У вас успешно создался учитель");
	}
	
	public static void createTeacherSenior(){
		sc.nextLine();
		System.out.println("Введите Логин:");
		String Teacherlogin = sc.nextLine();
		System.out.println("Введите Пароль:");
		String TeacherPassword = sc.nextLine();
		Teacher newTeacher = new Teacher(Teacherlogin,TeacherPassword,TeacherType.SeniorLector);
		if(DBcontext.teachers == null) {
			DBcontext.teachers = new Vector<>();
		}
		DBcontext.teachers.add(newTeacher);
		//DBcontext.SaveTeachers();
		
		
		 DBcontext.saveTeacher(DBcontext.teachers);

		 System.out.println("У вас успешно создался учитель");
	}
	
	public static void createTeacherProfessor(){
		sc.nextLine();
		System.out.println("Введите Логин:");
		String Teacherlogin = sc.nextLine();
		System.out.println("Введите Пароль:");
		String TeacherPassword = sc.nextLine();
		Teacher newTeacher = new Teacher(Teacherlogin,TeacherPassword,TeacherType.Proffesor);
		if(DBcontext.teachers == null) {
			DBcontext.teachers = new Vector<>();
		}
		DBcontext.teachers.add(newTeacher);
		//DBcontext.SaveTeachers();
		
		
		 DBcontext.saveTeacher(DBcontext.teachers);

		 System.out.println("У вас успешно создался учитель");
	}
	
	
	
	public static void createManager() {
	    sc.nextLine();
	    System.out.println("Введите Логин:");
	    String managerLogin = sc.nextLine();
	    System.out.println("Введите Пароль:");
	    String managerPassword = sc.nextLine();

	   
	    Manager newManager = new Manager(managerLogin, managerPassword);

	    
	    if (DBcontext.managers == null) {
	        DBcontext.managers = new Vector<>();
	    }

	    
	    DBcontext.managers.add(newManager);

	    
	    DBcontext.saveManager(DBcontext.managers);

	    System.out.println("Менеджер успешно создан!");
	}

	public static void createAdmin() {
	    sc.nextLine();
	    System.out.println("Введите Логин:");
	    String adminLogin = sc.nextLine();
	    System.out.println("Введите Пароль:");
	    String adminPassword = sc.nextLine();

	    
	    AdminMoments newAdmin = new AdminMoments(adminLogin, adminPassword);

	
	    
	    if (DBcontext.admins == null) {
	        DBcontext.admins = new Vector<>(); 
	    }

	   
	    DBcontext.admins.add(newAdmin);

	    
	    DBcontext.saveAdmin(DBcontext.admins);

	    System.out.println("Админ успешно создан!");
	}
	

	public static void createDean() {
		 sc.nextLine();
		    System.out.println("Введите Логин:");
		    String deanLogin = sc.nextLine();
		    System.out.println("Введите Пароль:");
		    String deanPassword = sc.nextLine();

		    
		    Dean newDean= new Dean(deanLogin,deanPassword);

		
		    
		    if (DBcontext.deans == null) {
		        DBcontext.deans = new Vector<>(); 
		    }

		   
		    DBcontext.deans.add(newDean);

		    
		    DBcontext.saveDean(DBcontext.deans);

		    System.out.println("Декан успешно создан!");
	}
	

}