package curs1;

public class wagecalculator {
	
	public int hoursWorked = 40;

	public static void main(String[] args) {
		
		Tester tester1 = new Tester();
		tester1.setName("Oana");
		tester1.setRatePerHour(55);
		
		Tester tester2 = new Tester();
		
	    tester2.setName("Matei");
	    tester2.setRatePerHour(30);
		System.out.println(tester2.getName());
		System.out.println(tester1.getName());
		
		wagecalculator Obj = new wagecalculator ();
		System.out.println(Obj.calculateSalary(tester1.getRatePerHour()));
				
		
		
	  
		
	}
	
	public int calculateSalary(int plataPeOra) {
		
		int salary = plataPeOra*hoursWorked;
		return salary;
	}
	
	

}
