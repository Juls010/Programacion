package ejercicios_java2;

public class Tetera {

	private int cantidadMaxima;
	private int cantidadActual;
	
	//Constructores:
	public Tetera () {
		cantidadMaxima=1000;
		cantidadActual=0;
	}
	public Tetera (Integer cantMax) {
		this.cantidadMaxima=cantMax;
		cantidadActual=cantMax;
	}
	public Tetera(Integer cantMax, Integer cantAct) {
		this.cantidadMaxima=cantMax;
		this.cantidadActual=cantAct;
		if(cantAct>cantMax) {
			cantAct=cantMax;
		}
	}
	
	//Getters y Setters:
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	
	//Métodos:
	
	public void llenarTe() {
		cantidadActual = cantidadMaxima;
	}
	public void servirTaza(int taza) {
		if(cantidadActual<taza) {
			cantidadActual=taza;
		}else {
			cantidadActual=cantidadActual-taza;
		}
	}
	public void vaciarTe() {
		cantidadActual=0;
	}
	public void agregarCafe(int cafe) {
		cantidadActual=cantidadActual+cafe;
		if(cantidadActual>cantidadMaxima) {
			System.out.println("Lo siento, pero has superado la capacidad de la tetera, que es "+ cantidadMaxima);
			cantidadActual=cantidadMaxima;
		}
		
	}
	
	//main:
	public static void main(String[] args) {
	
		Tetera tetera1 = new Tetera();
		tetera1.getCantidadActual();
		tetera1.getCantidadMaxima();
		System.out.println("la capacidad maxima de la tetera es: "+ tetera1.getCantidadMaxima()+" La capacidad actual es: "+tetera1.getCantidadActual());
		
	}

	

}
