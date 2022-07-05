package TemaCurs6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SavingsAccount extends Account {

	

	 public static void displayBalance(int balance)
	    {
	        System.out.println("Current Balance : " + balance);
	        System.out.println();
	    }
	  
	   
	    public static int amountWithdrawing(int balance, int withdraw)
	    {
	        
	        System.out.println("Withdrawing Amount : " + withdraw);
	        if (balance >= withdraw) {
	            balance = balance - withdraw;
	            System.out.println(
	                "Please collect your money!");
	            displayBalance(balance);
	        }
	        else {
	            System.out.println("Insufficient funds for transaction");
	            System.out.println();
	        }
	        return balance;

		}

}
