package ejercicios_java2;

public class Ventana {
	
	public boolean abierta;
	
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
