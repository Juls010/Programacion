package ejercicios_java2;

public class NIF {

	private int nDNI;
	private String letraDNI;
	
	//Constructores:
	public NIF() {
		nDNI=0;
		letraDNI=null;
	}
		
	public NIF(Integer nDNI,String letraDNI) {
		this.nDNI = nDNI;
		this.letraDNI=letraDNI;
	}
	
	//Getters y Setters:
	
	public int getnDNI() {
		return nDNI;
	}

	public void setnDNI(int nDNI) {
		this.nDNI = nDNI;
	}

	public String getLetraDNI() {
		return letraDNI;
	}

	public void setLetraDNI(String letraDNI) {
		this.letraDNI = letraDNI;
	}

	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
	}

	
}
