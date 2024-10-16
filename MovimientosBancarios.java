package movimiento;

public class MovimientosBancarios {
	public static void main (String []args) {
		System.out.println("Quieres hacer un ingreso?");	
		
		//damos por hecho de que si:
		Movimientos movimiento1  = new Movimientos("Nómina", 1200);
		movimiento1.ingreso();
		
		System.out.println("Quieres hacer otro ingreso?");
		
		//segundo movimiento, resta:
		Movimientos movimiento2 = new Movimientos("Factura telefonía", 80);
		movimiento2.retirada();
		
		System.out.println("Quieres hacer otro ingreso?");
		
		//tercer movimiento, resta:
		Movimientos movimientos3 = new Movimientos("Factura Luz", 150);
		movimientos3.retirada();
		
		System.out.println("el saldo es: " + Movimientos.getSaldoCuenta());
			
	}
	
	
	
}
