package Temavehicul;

public class Masina extends Vehicul {

	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
		
	}
	
	@Override
	public String nume() {
		return "masina";
	}
	
	@Override
	public String motorizare() {
		return "motor";
	}

}
