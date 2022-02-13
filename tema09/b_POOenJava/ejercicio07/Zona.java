package tema09.b_POOenJava.ejercicio07;

public class Zona {
  
  private int totalEntradas;


  public int getTotalEntradas() {
    return this.totalEntradas;
  }

  public void setTotalEntradas(int totalEntradas) {
    this.totalEntradas = totalEntradas;
  }  
  
  public Zona(int entradas) {
    this.totalEntradas = entradas;
  }

  public Zona() {
  }

  void vendida(int r) {
    if (this.totalEntradas > 0) {
      this.totalEntradas -= r;
    } else {
      System.out.println("Lo siento no quedan más entradas para esta zona.");
    }
    
  }


  @Override
  public String toString() {
    return String.valueOf(getTotalEntradas());
  }















}
