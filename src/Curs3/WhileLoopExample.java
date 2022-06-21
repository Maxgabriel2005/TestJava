package Curs3;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un numar:");
		Scanner scan = new Scanner(System.in);
		int numar = scan.nextInt();
		
		System.out.println("rezolvare cu for:");
		
		for(int i = 1; i <=10; i++) {
			
			System.out.println(numar + " * " + i + " = " + numar*i);
		}
		
		
		System.out.println("rezolvare cu while:");
		
		int x =1;
		while(x<=10) {
			System.out.println(numar + " * " + x + " = " + numar*x);
			x++;
		}
		
		
		
		
	}

}
