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
    if ((this.totalEntradas > 0) && (this.totalEntradas > r)) {
      this.totalEntradas -= r;
    } else {
      System.out.println("\033[31mLo siento no hay entradas para esta zona. \033[0m");
    }
    
  }

  @Override
  public String toString() {
    return String.valueOf(getTotalEntradas());
  }















}
