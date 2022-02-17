package tema09.b_POOenJava.ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {

	double saldo;
	String numero;
	
	public TarjetaRegalo(double saldo) {
		this.saldo = saldo;		
		this.numero = "";
		for (int i = 0; i < 6; i++) {
		this.numero += (int)(Math.random() * 10);
		}
	}

	@Override
	public String toString() {
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
		return "Tarjeta nº " + numero + " - " + "Saldo " + dosDecimales.format(saldo) + " euros";
	}
	
	void gasta(double s) {
		if (saldo < s) {
			System.out.printf("No puede gastar %.2f euros, su saldo es %.2f euros\n", s, saldo);
		} else {
			saldo -= s;
		}
	}
	
	TarjetaRegalo fusionaCon(TarjetaRegalo t) {
		double saldoActualizado = this.getSaldo() + t.getSaldo();
		this.setSaldo(0);
		t.setSaldo(0);
		return new TarjetaRegalo(saldoActualizado);
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
