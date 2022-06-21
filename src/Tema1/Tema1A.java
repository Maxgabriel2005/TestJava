package Tema1;

import java.util.Scanner;

public class Tema1A {
	
	int numar;
	
	

	
	public void PunctajTest () {
		
		
		if (numar <= 66 ) {
			System.out.println(" Ai picat.Mai incearca!");
				
		}else {
			System.out.println(" Felicitari,Ai trecut!");
			
		}
		
	}
	
     public void askTheUser( ) {
	
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul :");
		numar = scan.nextInt();
		scan.close();
   }	
	
}
