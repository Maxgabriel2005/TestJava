package Curs4.polymorphism;

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		//System.out.println(obj.multiply(2, 3));
		System.out.println(obj.multiplyDouble(2, 3));
		
		System.out.println(123);  // int
		System.out.println("text"); // string
		System.out.println('c'); // char (caracter
		System.out.println(2.5); //double
	

	}
	
	public int multiply(int num1, int num2) {
		
		return num1 * num2;
	}
	
	public double multiplyDouble(double num1, double num2) {
		
		return num1*num2;
	}

}
