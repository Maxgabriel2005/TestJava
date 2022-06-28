package Temavehicul;

public class Bicicleta extends Vehicul {
	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}
	@Override
	public String nume() {
		return "bicicleta";
	}
	
	@Override
	public String motorizare() {
		return "pedale";
	
	}
	
	
}

