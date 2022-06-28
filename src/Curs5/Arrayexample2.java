package Curs5;

public class Arrayexample2 {

	public static void main(String[] args) {
		
		String[] orase = {"Iasi", "Cluj", "Arad", "Alba"};
		
		//for clasic
		for(int i = 0; i<orase.length; i++) {
			System.out.println(orase[i]);
		}
		
		//for each
		for(String oras : orase) {
			System.out.println(oras);
		}

	}

}
