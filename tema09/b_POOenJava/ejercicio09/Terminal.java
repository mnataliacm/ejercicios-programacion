package tema09.b_POOenJava.ejercicio09;

public abstract class Terminal {
  private String numero;  
  protected String tarifa;
  
  public Terminal(String numero, String tarifa) {
    this.numero = numero;
    this.tarifa = tarifa;
  }
  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTarifa() {
    return this.tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }

}
  

