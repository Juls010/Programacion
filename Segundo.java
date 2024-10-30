package restaurante;

public class Segundo {
	
	private String segundo;
	private float precio;
	
	//Constructor con el segundo plato y su precio:
	public Segundo(String segundo, float precio) {
		this.segundo=segundo;
		this.precio=precio;
	}
	
	//Métodos get del segundo plato y del precio:
	public String getSegundo() {
		return segundo;
	}

	public float getPrecio() {
		return precio;
	}	
}
