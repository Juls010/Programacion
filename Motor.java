package ejercicios_java2;

public class Motor {
	
	
	private boolean arrancado;
	
	
	//M�todo constructor:
	public Motor () {
		
	}
	
	//M�todos:
	public void arrancarMotor() {
		arrancado = true;
		System.out.println("El motor est� arrancado");
		
	}
	
	public void apagarMotor() {
		arrancado = false;
		System.out.println("El motor est� apagado");
	}
	
	public boolean isArrandado() {
		return arrancado;
		
	}
	
	
}
