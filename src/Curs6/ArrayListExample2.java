package Curs6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));//import java.util ti cursorul
		System.out.println(lista.size());
		lista.add("sase");
		
		for(String numar : lista) {
			System.out.println(numar);
		}
		
//sublista
		lista.subList(1, 4).clear();
		
		System.out.println("------------");
		
		for(String numar : lista) {
			System.out.println(numar);
		}
		
		String element = "sase"; // daca pui opt sau alt numar va printa ca nu contine elementul
		if(lista.contains(element)) {
			System.out.println("Contine elementul ");
			
		}else {
			System.out.println("Nu contine elementul ");
			
		}
		
		System.out.println("-------------");
		System.out.println("---------");
		Iterator<String> iterator = lista.iterator(); //import java.util
		while(iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		
	}

}
