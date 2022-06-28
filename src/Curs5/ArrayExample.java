package Curs5;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] textArray = new String[5];
		textArray[0] = "This "; //pozitia 1
		
		System.out.println(textArray[0]);
		
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "Array ";
		textArray[4] = "!";
		
		
		System.out.println(textArray[1]);
		
		for (int i = 0; i<textArray.length; i++) {
				System.out.print(textArray[i]);
		}
		
		for(String element : textArray) {
			System.out.print(element);
		}

	}

}
