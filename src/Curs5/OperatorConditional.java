package Curs5;

import java.util.Scanner;

public class OperatorConditional {
	
	/*
	 * 2 numere de la tastatura daca sunt pozitive sau nu si care dintre ele este cel mai mic
	 */

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert first number : ");
		num1 = scan.nextInt();
		
		System.out.println("PLease insert second number: ");
		num2 = scan.nextInt();
		
		//ternarry (conditie) ? expresie1 : expresie2
		//result = (num1>=0) ? "Num1 is pozitiv" : "Num1 is negative"
		
		if(num1>=0) {
			System.out.println("Num1 is positiv" );
		
		}else {
			System.out.println("Num1 is negativ");
		}
		
		String result;
		result = (num1>=0) ? "Num1 is pass" : "Num1 is negative";
			System.out.println(result);
		
		if(num2>=0) {
			System.out.println("Num2 is positiv" );
			//Num2 la fel ca string result
		
		}else {
			System.out.println("Num2 is negativ");
		}
		if(num1>=0 && num2>=0) { // la fel cu string result inlocuite dau la fel
			System.out.println("Both Pozitive");
		
		}else {
			System.out.println("At least one negative");
		}
		if(num1>num2) { //aici mai jos
			System.out.println("Num2 is the smallest");
			
		}else if(num1 == num2) {
			System.out.println("Are equals");
			
		}else {
			System.out.println("Num1 is smallest");
			System.out.println(result);
			result = (num1 == num2? "Numbers are equals" : (num1>num2)? "Num2 is the smallest":"Num1 is the smallest");
			System.out.println(result);
		}

	}

	}
	

