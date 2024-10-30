package restaurante;

public class Postre {

	private String postre;
	private float precio;
	
	
	//Constructor con el postre y su precio:
	public Postre(String postre, float precio) {
		this.postre=postre;
		this.precio=precio;
	}
	
	//Métodos get del postre y del precio:
	public String getPostre() {
		return postre;
	}

	public float getPrecio() {
		return precio;
	}	
	
	
	
}
