package tema09.b_POOenJava.ejercicio10;

public class Ameba {
  
  private int peso = 3;


  public int getPeso() {   
    return this.peso;
  }

  public void setPeso(int peso) {
    peso += peso;
    this.peso = peso;
  }

  void come(int x) {
    peso += x - 1;
  }

  void come (Ameba a) {
    peso += a.peso -1;
    a.peso = 0;
  }


  @Override
  public String toString() {
    return "Soy una ameba y peso " + getPeso() + " microgramos.";
  }


}
