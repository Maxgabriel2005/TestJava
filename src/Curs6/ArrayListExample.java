package Curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>(); //ti cursorul pe List si ArrayList sa importi java.util
		//acelasi cu ArrayList<String> lista =new ArrayList<>();
		
		//marimea listei
		System.out.println(lista.size());
		//array[0] = valoare
		//lista.add("Oana");
		//System.out.println(lista.size()); //va printa 1 ca e doar Oana
		lista.add("Oana");
		lista.add("Ion");
		lista.add("Maria");
		lista.add("Ioana");
		lista.add("George");
		
		for(String nume : lista) {
			System.out.println(nume); //va printa toata lista de nume
		}
		
		System.out.println("-----------");
		
		for(String nume : lista) {
			System.out.println(lista.indexOf(nume) + " : " + nume);
		
		}
		
		//array[1] = valoare_noua --> in cazul array suprascrie
		
		lista.add(0, "Alina");
		System.out.println("==========");
		for(String nume : lista) {
			System.out.println(lista.indexOf(nume) + " : " + nume);
			
		}	
		lista.set(0, "Bogdan");    // lista set
		System.out.println("-------------");
		for(String nume : lista) {
			System.out.println(lista.indexOf(nume) + " : " + nume);
		}
		
		
		lista.remove(0);
		lista.remove("Ion");
		System.out.println("==========");
		for(String nume : lista) {
			System.out.println(lista.indexOf(nume) + " : " + nume);
		}
		
		System.out.println("-----------");
		//remove all objects from list
		lista.clear();
		
		for(String nume : lista) {
			System.out.println(lista.indexOf(nume) + " : " + nume);
		}
		
	}

}
