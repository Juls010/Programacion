package ejercicios_java2;

public class Motor {
	
	
	private boolean arrancado;
	
	
	
	public void arrancarMotor() {
		arrancado = true;
		System.out.println("El motor está arrancado");
		
	}
	
	public void apagarMotor() {
		arrancado = false;
		System.out.println("El motor está apagado");
	}
	
	public boolean isArrandado() {
		return arrancado;
		
	}
	
	
}
