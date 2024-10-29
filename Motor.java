package furgoneta;

public class Motor {
	
	private String combustion;
	private String marca;
	private int cilindrada;
	private boolean arrancado;
	
	//Constructor:
	public Motor(String marca, String combustion,boolean arrancado, int cilindrada) {
		this.marca=marca;
		this.combustion=combustion;
		this.arrancado=arrancado;
		this.cilindrada=cilindrada;
	}
	
	
	

	//Métodos para arrancar y saber el estado del motor:
	public void arrancarMotor() {
			arrancado = true;
			System.out.println("El motor está arrancado");
			
	}
	public String getCombustion() {
		return combustion;
	}

	public void setCombustion(String combustion) {
		this.combustion = combustion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public void apagarMotor() {
			arrancado = false;
			System.out.println("El motor está apagado");
	}
	
	
}
