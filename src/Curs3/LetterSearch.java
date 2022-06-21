package Curs3;

import java.util.Scanner;

public class LetterSearch {
	
	//masina --> masina.chartAt(4)
	//012345
	//litera A exista in text
	
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un cuvant:");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		System.out.println(text.length());
		
		int counter =0;
		for(int i =0; i<text.length(); i++ ) {
			
			char currentLetter = text.charAt(i);
			if(currentLetter == 'a' || currentLetter == 'A') {
				counter++;
				System.out.println("Litera A exista in text!" +i);
				//break;
			}
		}
		if (counter == 0) {
			System.out.println("Nu am gasit litera A");
			
		}else {
			System.out.println("Am gasit litera A");
			
		}
	}

}
