package tema09.b_POOenJava.ejercicio09;

public class Movil extends Terminal {
  
  private double conversacion;
  private double precioTarifa;
  private double saldo;

  public double getConversacion() {
    return this.conversacion;
  }

  public void setConversacion(double conversacion) {
    this.conversacion = conversacion;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public Movil(String numero, String tarifa) {
    super(numero, tarifa);
  }

  public void llama(Movil m, double segundos) {
    this.conversacion += segundos;
    m.conversacion += segundos;
    if (tarifa.equals("rata")) {
      precioTarifa = 0.06;
    } 
    if (tarifa.equals("mono")) {
      precioTarifa = 0.12;
    }
    if (tarifa.equals("bisonte")) {
      precioTarifa = 0.30;
    }
    this.saldo += segundos * precioTarifa;
    m.saldo += segundos * precioTarifa;
  }

  @Override
  public String toString() {
    return "Nº " + getNumero() + " - " + getConversacion() + "s de conversación - tarificados " + getSaldo() + " euros";
  }

}
