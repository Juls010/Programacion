package movimiento;

public class Movimiento {
	
	private static float saldoCuenta = 0;
	private float cantidad;
	private String concepto;
 	private int idMovimiento = 0;
 	
 	public Movimientos(String concepto, float cantidad) {
 		this.concepto = concepto;
 		this.cantidad = cantidad;
 		idMovimiento++;
 		
 	}
 	public float ingreso() {
 		return saldoCuenta = saldoCuenta + cantidad;
 	 }
 	public float retirada() {
 		return saldoCuenta= saldoCuenta - cantidad;
 	}
 	public static float getSaldoCuenta() {
		return saldoCuenta;
	}
 	public static void setSaldoCuenta(float saldoCuenta) {
		saldoCuenta = saldoCuenta;
	}
	
}
