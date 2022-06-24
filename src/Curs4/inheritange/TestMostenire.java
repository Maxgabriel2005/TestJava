package Curs4.inheritange;

public class TestMostenire {

	public static void main(String[] args) {
		
		TesterAutomat tester = new TesterAutomat();
		
		
			tester.setLimbajProgramare("Java"); // --> Clasa TesterAutomat
			tester.setSenioritate("Junior"); // --> clasa Tester
			tester.setDepartament("QA"); // -- >Clasa Tester
			tester.setNume("Matei"); // --> clasa Angajat
			tester.setEmail("matei@matei.com"); // --> clasa Angajat
			
			System.out.println("Numele testerului este : " + tester.getNume() + ", face parte din " + "departamentul " + tester.getDepartament() + " este de nivel " + tester.getSenioritate() 
			+ " si scrie teste automate folosind " + tester.getLimbajProgramare() );
		}

	

}
