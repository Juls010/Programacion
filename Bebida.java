package restaurante;

public class Bebida {

	private String bebida;
	private float precio;
	
	
	//Constructor con la bebida y su precio:
	public Bebida(String bebida, float precio) {
		this.bebida=bebida;
		this.precio=precio;
	}
	
	//Métodos get de la bebida y del precio:
	public String getBebida() {
		return bebida;
	}

	public float getPrecio() {
		return precio;
	}	
}
