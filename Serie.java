package ejercicios_java2;

public class Serie {

	public String titulo;
	public String actor;
	public int nActores;
	
	//Constructor que recibe el par�metro t�tulo y autor:
	//Si queremos incrementar el n�mero de actores, podriamos hacerlo aqu� usando "nActores++"
	public Serie(String titulo, String actor) {
		this.titulo=titulo;
		this.actor=actor;
	}
	//Constructor predeterminado que inicializa las dos variables en cadenas vacias:
	public Serie() {
		titulo= "";
		actor="";
	}
	//M�todos getter y settes:
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
		
		System.out.println("El t�tulo de la serie es: "+ serie1.titulo+ ", y el actor o la actriz es: "+ serie1.actor);
		System.out.println("El n�mero de actores es: "+ serie1.getnActores());
		serie1.setActor("Pedro Pascal");
		System.out.println("El t�tulo de la serie es: "+ serie1.titulo+ ", y el actor o la actriz es: "+ serie1.actor);
	}
}
