package furgoneta;
public class Rueda {
	private boolean inflada;
	private int pulgadas;
	private String marca;
	
	//Constructor:
	public Rueda(String marcaR, int pulgadas, boolean inflada) {
		this.marca=marcaR;
		this.pulgadas=pulgadas;
		this.inflada=inflada;
	}
	
	//Métodos de get y set:
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Métodos para inflar o desinflar la rueda y saber su estado:
	public void infrar() {
		inflada = true;
	}
	public void desinflar() {
		inflada = false;
	}
	public void estadoRueda() {
		if(inflada) {
			System.out.println("La rueda está inflada");
		}else {
			System.out.println("La rueda está desinflada");
		}
	}
}
