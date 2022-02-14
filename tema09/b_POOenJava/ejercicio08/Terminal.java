package tema09.b_POOenJava.ejercicio08;

public class Terminal {
  private String numero;
  private int conversacion;
  
  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getConversacion() {
    return this.conversacion;
  }

  public void setConversacion(int conversacion) {
    this.conversacion = conversacion;
  }

  public Terminal(String numero, int conversacion) {
    this.numero = numero;
    this.conversacion = conversacion;
  }

  @Override
  public String toString() {
    return "Nº " + getNumero() + " - " + getConversacion() + "s de conversacion";
  }

  public void llama(Terminal t, int segundos) {
    this.conversacion += segundos;
    t.conversacion += segundos;
  }
  
}
