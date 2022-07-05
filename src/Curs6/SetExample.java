package Curs6;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();//import java.util
		System.out.println(set.size());
		
		set.add("rosu");
		System.out.println(set.isEmpty()); //false ca deja are valoare rosu
		
		set.add("alb");
		set.add("negru");
		set.add("galben");
		
		for(String culoare : set) {   // : inseamna din set
			
			System.out.println(culoare);
		}
		
		System.out.println("-----------");
		set.add("maro");
		
          for(String culoare : set) {   // : inseamna din set
			
			System.out.println(culoare);
          }
          
          set.remove("maro");  //trebuie iar pus for si sysout ctrl+space si sterge maro
          
          System.out.println("--------------------");
          System.out.println(set.contains("negru"));
          set.clear();
          for(String culoare : set) {   // : inseamna din set
  			
  			System.out.println(culoare);
  			System.out.println("--------------------");
  			
          }

	}

}
