package Temavehicul;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}
	
	
	public String nume() {
		return "nume general";
	
	}
	public String motorizare() {
		return "motorizare generica";
	}
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru vehiculul" + brand + " este :" +nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h");
		
	}

}
