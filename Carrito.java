package paqueteTPN5;

public class Carrito {
	private int numC;
	private Cliente cli;
	private double montoTotal;
			
			public Carrito(int num, Cliente cliente) {
				numC = num;
				cli = cliente;
				montoTotal = 0.0;
				
			}
			public int damenumc() {
				return numC;
				
			}
			public Cliente dameCliente() {
				return cli;
			}
			public double dameMontoTotal() {
				return montoTotal;
			}
			public void mostrarMontoTotal(double monto) {
				System.out.println("EL MONTO TOTAL DEL CARRITO ES : " +monto);
			}

		

		
	}


