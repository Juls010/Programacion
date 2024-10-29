package furgoneta;


public class Furgoneta {

		private Motor motor;
		private Rueda r1,r2,r3,r4;
		private Ventana v1,v2,v3,v4;
		private Puerta p1,p2,p3,p4,p5;
		

		public Furgoneta() {
			
		}
		public Furgoneta(String marca, String combustion,boolean arrancado, int cilindrada,boolean abierta, boolean tintada,String color, boolean pAbierta,String marcaR, int pulgadas, boolean inflada ) {
			motor = new Motor(marca,combustion,arrancado,cilindrada);
			p1 = new Puerta(color, pAbierta);
			p2 = new Puerta(color, pAbierta);
			p3 = new Puerta(color, pAbierta);
			p4 = new Puerta(color, pAbierta);
			p5 = new Puerta(color, pAbierta);
			v1 = new Ventana(abierta,tintada);
			v2 = new Ventana(abierta,tintada);
			v3 = new Ventana(abierta,tintada);
			v4 = new Ventana(abierta,tintada);
			r1 = new Rueda(marcaR,pulgadas,inflada);
			r2 = new Rueda(marcaR,pulgadas,inflada);
			r3 = new Rueda(marcaR,pulgadas,inflada);
			r4 = new Rueda(marcaR,pulgadas,inflada);
			
		}

		public void arrancar() {
			motor.arrancarMotor();
		}
		public void apagarMotor() {
			motor.apagarMotor();
		}
		
		public void abrirPuerta1() {
			p1.abrirPuerta();
		}
		
		
		public static void main (String []args) {
			
			Furgoneta f = new Furgoneta();
			
			
			
			
		}
		
}
