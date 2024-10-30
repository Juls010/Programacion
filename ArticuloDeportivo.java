package ejercicios;

public class ArticuloDeportivo {

	public String nombreArticulo;
	public String autor;
	public String palabraClave;
	public String nombrePublicacion;
	public int anio;
	public String resumen;
	
	public ArticuloDeportivo(String nombreArticulo, String autor) {
		this.nombreArticulo=nombreArticulo;
		this.autor=autor;
	}
	
	public ArticuloDeportivo(String nombreArticulo, String autor, String palabraClave, String nombrePublicacion, int anio) {
		this.nombreArticulo=nombreArticulo;
		this.autor=autor;
		this.palabraClave=palabraClave;
		this.nombrePublicacion=nombrePublicacion;
		this.anio=anio;
	}
	
	public ArticuloDeportivo(String nombreArticulo,String autor, String palabraClave, String nombrePublicacion, int anio, String resumen) {
		this.nombreArticulo=nombreArticulo;
		this.autor=autor;
		this.palabraClave=palabraClave;
		this.nombrePublicacion=nombrePublicacion;
		this.anio=anio;
		this.resumen=resumen;
	}
	
	public void getArticuloDeportivo() {
		System.out.println(nombreArticulo);
		System.out.println(autor);
		System.out.println(palabraClave);
		System.out.println(nombrePublicacion);
		System.out.println(anio);
		System.out.println(resumen);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArticuloDeportivo articulo1 = new ArticuloDeportivo("Fernando Alonso se retira","Pepe Fuentes","F1, Alonso, Carrera","Articulo de DZN",2024,"Alonso de harta de Aston Martin");
		articulo1.getArticuloDeportivo();
	}

}
