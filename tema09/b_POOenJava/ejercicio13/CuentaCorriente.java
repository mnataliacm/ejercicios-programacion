package ejercicios.tema09.b_POOenJava.ejercicio13;

public class CuentaCorriente {
	
<<<<<<< HEAD
	private double saldo;
	private String numero;
	
	//constructor y generar el numero de cuenta
	public CuentaCorriente () {
		this.saldo = 0;
		this.numero = "";		
		for (int i = 0; i < 11; i++) {
			this.numero += (int)(Math.random() * 10);
		}
	}
=======
	private double saldo = 0;;
	private String numero;
	
	//constructor y generar el numero de cuenta
>>>>>>> b2a54ec3f4233123690b79353ef2e56b8e7996f6
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

<<<<<<< HEAD
	void ingreso(double i) {
		this.saldo += i;
	}
	
	void cargo(double c) {
		this.saldo -= c;
	}
	
	void transferencia(CuentaCorriente cc, double t) {
		this.saldo -= t;
		cc.saldo += t;
	}
	
	@Override
	public String toString() {
		return "Número de cta: " + numero + " Saldo: " + this.saldo + " €";
	}

}
=======
	
	

}
>>>>>>> b2a54ec3f4233123690b79353ef2e56b8e7996f6
