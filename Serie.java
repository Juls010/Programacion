package ejercicios_java2;

public class Serie {

	public String titulo;
	public String actor;
	public int nActores;
	
	//Constructor que recibe el parámetro título y autor:
	//Si queremos incrementar el número de actores, podriamos hacerlo aquí usando "nActores++"
	public Serie(String titulo, String actor) {
		this.titulo=titulo;
		this.actor=actor;
	}
	//Constructor predeterminado que inicializa las dos variables en cadenas vacias:
	public Serie() {
		titulo= "";
		actor="";
	}
	//Métodos getter y settes:
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getnActores() {
		return nActores;
	}
	public void setnActores(int nActores) {
		this.nActores = nActores;
	}
	
	public static void main (String[] args){
		Serie serie1 = new Serie ("Breaking Bad","Bryan Cranston");
		
		System.out.println("El título de la serie es: "+ serie1.titulo+ ", y el actor o la actriz es: "+ serie1.actor);
		System.out.println("El número de actores es: "+ serie1.getnActores());
		serie1.setActor("Pedro Pascal");
		System.out.println("El título de la serie es: "+ serie1.titulo+ ", y el actor o la actriz es: "+ serie1.actor);
	}
}
