package ejercicios;

public class Conversion {

	public float numero;
	
	//Métodos para hacer las conversiones:
	public Conversion(float numero) {
		this.numero=numero;
	}
	
	public float metroAcentimetros() {
		return numero*100;
	}
	
	public float metroAmilimetros() {
		return numero*1000;
	}
	
	public float metroApulgadas() {
		return numero*39.37f;
	}
	
	public float metroApies() {
		return numero*3.28f;
	}
	
	public float metroAyardas() {
		return numero*1.09f;
	}
	
	public static void main(String[] args) {
		//Llamada en el main para ver que se hacen correctamente:
		Conversion conversion1 = new Conversion(5);
		System.out.println(conversion1.metroAcentimetros());
		System.out.println(conversion1.metroAmilimetros());
		System.out.println(conversion1.metroApies());
		System.out.println(conversion1.metroApulgadas());
		System.out.println(conversion1.metroAyardas());
	}

}
