package TemaCurs6;

public class Account {


		
		private int accountNumber;
		public double balance;
		public Customer accountOwner;
		
	  
		balance = Account(balance, withdraw);

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


