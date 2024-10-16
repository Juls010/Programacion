package libro;

public class Libro {
	
	private String isbn;
	private String titulo;
	private int anio;
	private static boolean prestado;
	
	public Libro(String isbn, String titulo, int anio) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anio = anio;
		
	}
	
	public void prestar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	
	}
	
	public void estado() {
		if(prestado = true) {
			System.out.println("El libro está prestado");
		}else {
			System.out.println("El libro está disponible");
		}
		
	}
	
}
