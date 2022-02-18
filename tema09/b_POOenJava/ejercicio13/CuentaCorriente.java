package ejercicios.tema09.b_POOenJava.ejercicio13;

public class CuentaCorriente {
	
	private double saldo = 0;;
	private String numero;
	
	//constructor y generar el numero de cuenta
	public CuentaCorriente (double saldo) {
		this.saldo = saldo;
		this.numero = "";		
		for (int i = 0; i < 11; i++) {
			this.numero += (int)(Math.random() * 10);
		}
	}
	//getter y setter
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

}
