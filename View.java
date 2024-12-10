package ProjectB;

import java.util.*;
//import java.io.*;



public class View {
	
	
	static Scanner sc = new Scanner(System.in);

    
	
	public static void main(String[] args) {
		System.out.println("1: Registration");
		System.out.println("2: Welcome");
		int scan = sc.nextInt();
		if(scan == 1) {
			Admin admin = new Admin();
			admin.registration();
		}
		
	}
	
}
