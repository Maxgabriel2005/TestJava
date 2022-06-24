package TemaLog;

import java.util.Scanner;

public class LogOn {
	
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);	
		
		String user,pass;
		int attempts = 0;

		do
		{
			
			System.out.print("Enter a user: ");
			user = scanner.next();

			System.out.print("Enter a password: ");
			pass = scanner.next();
			
			if (user.equals("TestUser") && pass.equals("1234")) {
			System.out.println("Login successful.");
			break;
			
			
			
			
			}
			
			else if (attempts<2) {
				System.out.println("Login error.");
				attempts++;
				
				
			}
			
			else {
				System.out.println("reach maximum");
				break;
			}
			
			
			
		}
		while (attempts <= 3);

		
		
		scanner.close();
		
        
		
	}
	

}
