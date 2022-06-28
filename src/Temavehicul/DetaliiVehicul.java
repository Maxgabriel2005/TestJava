package Temavehicul;

public class DetaliiVehicul {
	
	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta("Pegas", 0, 90);
		bicicleta.detaliiVehicul();
		verificaMotorizarea(bicicleta);
		
		Masina masina = new Masina("Dacia", 86, 190);
		masina.detaliiVehicul();
		verificaMotorizarea(masina);
	}
	
	public static void verificaMotorizarea(Vehicul obj) {
		System.out.println("Aceasta este o " + obj.nume() + " si are " + obj.motorizare() );
	}

}
