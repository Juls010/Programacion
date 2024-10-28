package ejercicios_java2;

public class NIF {

	public String nDNI;
	public String letraDNI;
	
	//Constructores:
	public NIF() {
		nDNI= "0";
		letraDNI=null;
	}
	public NIF(String numerosDNI) {
		nDNI = numerosDNI;
		letraDNI= encontrarLetra(nDNI);
	}
	
	//Getters y Setters:
	
	public String getnDNI() {
		return nDNI;
	}

	public void setnDNI(String nDNI) {
		
	}

	public String getLetraDNI() {
		return letraDNI;
	}

	public void setLetraDNI(String letraDNI) {
		this.letraDNI = letraDNI;
	}

	
	//Método para encontrar la letra del DNI:
	private String encontrarLetra(String dni) {
		int resto = Integer.parseInt(dni) % 23;
		if(resto == 0) {
			letraDNI = "T";
		}else if (resto==1) {
			letraDNI = "R";
		}else if (resto==2) {
			letraDNI = "w";
		}else if (resto==3) {
			letraDNI = "A";
		}else if (resto==4) {
			letraDNI = "G";
		}else if (resto ==5) {
			letraDNI = "M";
		}else if (resto==6) {
			letraDNI = "Y";
		}else if (resto==7) {
			letraDNI = "F";
		}else if (resto==8) {
			letraDNI = "P";
		}else if (resto==9) {
			letraDNI = "D";
		}else if (resto==10) {
			letraDNI = "X";
		}else if (resto==11) {
			letraDNI = "B";
		}else if (resto==12) {
			letraDNI = "N";
		}else if (resto==13) {
			letraDNI = "J";
		}else if (resto==14) {
			letraDNI = "Z";
		}else if (resto==15) {
			letraDNI = "S";
		}else if (resto==16) {
			letraDNI = "Q";
		}else if (resto==17) {
			letraDNI = "V";
		}else if (resto==18) {
			letraDNI = "H";
		}else if (resto==19) {
			letraDNI = "L";
		}else if (resto==20) {
			letraDNI = "C";
		}else if (resto==21) {
			letraDNI = "K";
		}else {
			letraDNI = "E";
		}
		return letraDNI;
	}
	
	
	public void leer() {
		System.out.println("El dni con número : "+nDNI+", tiene como letra: "+letraDNI);
	}
	
	
	public static void main(String[] args) {
		NIF dni1 = new NIF ("54221932");
		dni1.leer();
	}

	
}
