package curs2;

import java.util.Scanner;

public class Calculator {
	
	
	/*
	 * operatii de baza + _*  /
	 */
	 
	 int numar1;
	 int numar2;
	 char operation;
	 int result;
	 
	 public void askTheUser() {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please insert first number :");
		 numar1 = scan.nextInt();
		 System.out.println("Please enter the operation:");
		 operation = scan.next().charAt(0);
		 System.out.println("Please insert second number :");
		 numar2 = scan.nextInt();
		 
	 }
	 
	 
	 public void printResult() {
		 System.out.println(numar1 + "" + operation + "" + numar2 + " = " + result);
		 		
	 }
	 
	 public void calculateValues() {
		 askTheUser();
		 
		 if(operation == '+') {
			 result = numar1 + numar2;
			 
		 }else if(operation == '-') {
			 result = numar1 - numar2;
			 
		 }else if(operation == '*') {
			 result = numar1 * numar2;
			 
		 }else if(operation == '/') {
			 result = numar1 / numar2;
	  
	 }else {
		 System.out.println("Wrong operation!.Please insert only +,-,*,/");
	 
		 }
	 }

}
