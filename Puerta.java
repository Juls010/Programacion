package ejercicios_java2;

public class Puerta {
	public boolean pAbierta;
	
	public void abrirPuerta() {
		pAbierta = true;
	}
	public void cerrarPuerta() {
		pAbierta = false;
	}
	public void estadoPuerta() {
		if(pAbierta) {
			System.out.println("La puerta est� abierta");
		}else{
			System.out.println("La puerta est� cerrada");
		}
	}
}
