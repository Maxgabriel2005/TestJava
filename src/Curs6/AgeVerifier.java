package Curs6;

//LEGAT DE MY CUSCTOMEXception
public class AgeVerifier {
	
	public void checkAgeLimit(int age) throws MyCustomException {
		
		if(age < 18) {
			throw new MyCustomException("Invalid Age");
			
		}else {
			System.out.println("You are allowed");
		}
	}
	
	
	

}
