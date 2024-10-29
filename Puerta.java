package furgoneta;

public class Puerta {
	private boolean pAbierta;
	private String color;
	private Ventana v;
	
	//Constructor:
	public Puerta() {
		
	}
	public Puerta(String color, boolean pAbierta) {
		this.color=color;
		this.pAbierta=pAbierta;
		v = new Ventana();
	}
	
	//Metodo get y set del atributo color:
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//Métodos para abrir y cerrar la puerta y saber su estado:
	public void abrirPuerta() {
		pAbierta = true;
	}
	public void cerrarPuerta() {
		pAbierta = false;
	}
	public void estadoPuerta() {
		if(pAbierta) {
			System.out.println("La puerta está abierta");
		}else{
			System.out.println("La puerta está cerrada");
		}
	}
}
