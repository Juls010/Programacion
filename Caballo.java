package caballo;

public class Caballo {
	private String nombreCaballo;
	private String colorCaballo;
	private int edadCaballo;
	private int victorias;
	private int derrotas;
	private int trofeos;
	

	public Caballo(String nombreCaballo, String colorCaballo,int edadCaballo, int victorias, int derrotas,int trofeos) {
		this.nombreCaballo = nombreCaballo;
		this.colorCaballo = colorCaballo;
		this.edadCaballo = edadCaballo;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.trofeos = trofeos;
	}


	public String getNombreCaballo() {
		return nombreCaballo;
	}
	public void setNombreCaballo() {
		this.nombreCaballo = nombreCaballo;
	}
	public int getEdadCaballo() {
		return edadCaballo++;
	}
	public void setEdadCaballo() {
		this.edadCaballo = edadCaballo;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias() {
		this.victorias++;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas() {
		this.derrotas++;
	}
	public int getTrofeos() {
		return trofeos;
	}
	public void setTrofeos() {
		this.trofeos++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
