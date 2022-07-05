package Curs6;

public class TestAgeVerifier {

	public static void main(String[] args) throws MyCustomException {
		
       AgeVerifier ageCheck = new AgeVerifier();
		
		try {
			ageCheck.checkAgeLimit(6);
			
		} catch (MyCustomException e) {
			System.out.println("You must be 18 to vote");
			e.printStackTrace();
		}
		System.out.println("Code after try catch");
		
		
		

	}

}
