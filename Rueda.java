package ejercicios_java2;

public class Rueda {
	
	public boolean inflada;
	
	public void infrar() {
		inflada = true;
	}
	public void desinflar() {
		inflada = false;
	}
	
	public void estadoRueda() {
		if(inflada) {
			System.out.println("La rueda est� inflada");
		}else {
			System.out.println("La rueda est� desinflada");
		}
	}
}
