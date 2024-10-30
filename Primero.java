package restaurante;

public class Primero {
	
	private String primero;
	private float precio;
	
	//Constructor con el primer plato y su precio:
	public Primero(String primero, float precio) {
		this.primero=primero;
		this.precio=precio;
	}
	
	//Métodos get del primer plato y del precio:
	public String getPrimero() {
		return primero;
	}

	public float getPrecio() {
		return precio;
	}	
}
