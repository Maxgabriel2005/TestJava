package Curs5;

public class StringComparasion {

	public static void main(String[] args) {
		
		String firstString = "Java";
		String secondString = "automation";
		String thirdString = "Java";
		String fourthString = new String("Java");
		
		System.out.println(" == ");
		System.out.println(firstString == secondString);
		System.out.println("equals ");
		System.out.println(firstString.equals(secondString));
		
		System.out.println("-----------");
		
		System.out.println(" == ");
		System.out.println(firstString == thirdString);
		System.out.println("equals ");
		System.out.println(firstString.equals(secondString));
		
		System.out.println("----------------");
		
		System.out.println(" == ");
		System.out.println(firstString == fourthString);
		System.out.println("equals ");
		System.out.println(firstString.equals(secondString));
		
	}
 	
}
