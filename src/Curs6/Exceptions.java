package Curs6;

import java.util.InputMismatchException;
import java.util.Scanner;

import TemaCurs6.Customer;

public class Exceptions extends Customer {

	public static void main(String[] args) {
		
		//thread.sleep(4000);
		
		//try {
		//	Thread.sleep(4000);
		//} catch (InterruptedException e) {
			
		//	e.printStackTrace();
		//} //faci surround with try/catch ti cursorul pe thread
		
		try {
		
		Scanner scan = new Scanner(System.in); //import scan
		System.out.println("Introdu un numar :" );
		int num1 = scan.nextInt();
		System.out.println("Introdu alt numar :");
		int num2 = scan.nextInt();
		
		System.out.println("Rezultatul impartirii :" + num1/num2);
		
		}catch(ArithmeticException e) {
			System.out.println("Nu mai imparti la zero");
			
		}catch(InputMismatchException e) {
			System.out.println("Introdu doar integer");
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		
		System.out.println("Multumim ca ati folosit programul");

	}
	

}
