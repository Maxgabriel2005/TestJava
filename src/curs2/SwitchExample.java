package curs2;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * Un program ce intreaaba un calificativ
	 * La A  se printeaza excelent
	 * La B ...Foarte bine
	 * .....
	 * 
	 */
	String nota;
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat : ");
	    nota = scan.next();
		scan.close();
	}
	
	public void gradeStudent() {
		
		switch(nota.toUpperCase()) {
		
		case "A" :
			System.out.println("Excelent");
			break;
		case "B" : 
			System.out.println("Foarte bine");
			break;
		case "C" :
			System.out.println("Suficient");
			break;
		case "D" :
			System.out.println("Insuficient");
			break;
		default:
			System.out.println("Calificativ invalid!");
			break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
