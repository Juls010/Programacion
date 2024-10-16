package pizzeria;
public class Pizza {
	
	private String tamano;
	private String tipo;
	private String estado;
	private static int pizzasPedidas = 0;
	private static int pizzasServidas = 0;
	
	public Pizza (String tamano, String tipo) {
		this.tamano = tamano;
		this.tipo = tipo;
		this.estado = "pedida";
		pizzasPedidas++;
	}
	
	public String toString(){
		return "La pizza que se ha pedido es de tamaño: " + tamano + ", y el tipo es: " + tipo;
	}
	
	public static int getTotalPedidas() {
		return pizzasPedidas;
	}
	public static int getTotalServidas() {
		return pizzasServidas;
	}
	
	public void sirve() {
		if(this.estado.equals("pedida")) {
			this.estado = "servida";
			pizzasServidas++;
		}else {
			System.out.println("Esta pizza está servida");
		}
	}

	
	
}
