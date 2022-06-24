package Curs4.polymorphism;

public class TestOverride {

	public static void main(String[] args) {
		
		
		Tester tester = new Tester();
		
		tester.work();
		tester.scrieTeste();
		
		Angajat angajat = new Angajat();
		angajat.work();
		
		Developer developer = new Developer();
		developer.work();
		
		System.out.println("--------");
		
		//Angajat angajat2 = new Angajat(); //Datatype numeObiect operatorDeAssignare 
		// = operator de atribuire  new cuvant cheie care ne ajuta sa instantiem o clasa
		//iar Angajat() este constructorul clasei
		//angajat2.work();
		
		Angajat angajat2 = new Tester();
		angajat2.work();
		((Tester)angajat2).scrieTeste();
		
	}

}
