package Curs6;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			
			String nume = "Jhonny"; //daca pui null crapa dar finally se executa.
			System.out.println(nume.length());
			
		}catch(NullPointerException obj) {
			System.out.println("Null pointer occured");
			obj.printStackTrace(); //se foloseste la loguri
			
		}finally {
			System.out.println("Finally block of code");
		}

	}

}
