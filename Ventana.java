package furgoneta;
public class Ventana {
	private boolean abierta;
	private boolean tintada;
	
	//Constructor:
	public Ventana() {
		
	}
	public Ventana(boolean tintada,boolean abierta) {
		this.tintada=tintada;
		this.abierta=abierta;
	}
	
	//M�todo para saber tipo de cristal:
	public void tipoCristal() {
		if(tintada) {
			System.out.println("La ventana es tintada");
		}else {
			System.out.println("La ventana no es tintada");
		}
	}
	//M�todos para abrir, cerrar y saber el estado de la ventana:
	public void abrirVentana() {
		abierta = true;
	}
	public void cerrarVentana() {
		abierta = false;
	}
	public void estadoVentana() {
		if(abierta) {
			System.out.println("La ventana est� abierta");
		}else {
			System.out.println("La ventana est� cerrada");
		}
	}
}
