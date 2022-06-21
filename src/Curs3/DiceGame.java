package Curs3;

import java.util.Scanner;

public class DiceGame {
	
	public static void main(String[] args) {
		/*
		 * Un joc de zaruri
		 * reguli:
		 * user da total :2,6,12 pierde jocul
		 * daca da total 7,1 castiga
		 * daca da 10, 11 repeta si jocul continua
		 * 
		 * daca da oricare din combinatii nu au fost scrise repeta si raspunsul
		 * e boolean (true/false)
		 */
		//math.random da de la 0.0 la 0.9 si le rotunjeste
		
		
		
		
		boolean condition = true;
		
		while(condition)  {
			
			int dice1 =(int) (Math.random()*6+1);
			int dice2 =(int) (Math.random()*6+1);
			int sum = dice1+dice2;
			System.out.println("Ai dat :" +sum);
			
			
			
			if(sum ==2 || sum == 6 || sum == 12) {
				System.out.println("Imi pare rau.Ai dat :" + sum + " Ai pierdut");
				break;
			}else if(sum == 7 || sum == 11) {
				System.out.println("Felicitari ! Ai dat : " + sum + " Ai castigat");
				break;
			}else if(sum == 3 || sum == 10)	{
				System.out.println("Automat mai dai odata:");
			}
			System.out.println("Mai vrei sa dai odata?");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();
		}
		
		System.out.println("Game over!");
	}

}
