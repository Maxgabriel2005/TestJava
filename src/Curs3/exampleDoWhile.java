package Curs3;

import java.util.Scanner;

public class exampleDoWhile {
	
	/*
	 * un program care intreaba userul un numar
	 * inmulteste acel numar cu 10 si printeaza
	 * 
	 * face asta pana usrul introduce 0
	 */

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		do { 
			System.out.println("Enter a number :");
			number = scan.nextInt();
			System.out.println(number*10);
		}while(number !=0);

	}

}
