package ejercicios;

public class Atleta {

	public int id;
	public String nombre;
	public double tiempoAtleta;
	public static int atletas = 0;
	public static String seleccion = "Francia";
	public static Double tiempoEquipo=0.0;
	
	public Atleta(String nombre, double tiempoAtleta) {
		this.nombre=nombre;
		this.tiempoAtleta=tiempoAtleta;
		atletas++;
		tiempoEquipo = tiempoEquipo+tiempoAtleta;
	}
	
	public void cienMetros() {
		
		tiempoEquipo = tiempoEquipo+tiempoAtleta;
	}
	
	public static void seleccion() {
		System.out.println(seleccion);
	}
	public static void tiempoTotal() {
		System.out.println("El tiempo del equipo es: "+tiempoEquipo);
	}
	
	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Sara",0.25);
		Atleta atleta2 = new Atleta("Monica",0.25);
		Atleta atleta3 = new Atleta("Susana",0.25);
		Atleta atleta4 = new Atleta("Maria",0.25);
		
		tiempoTotal();
		
		
		
	}

}
