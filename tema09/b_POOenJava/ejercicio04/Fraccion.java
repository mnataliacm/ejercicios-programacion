package tema09.b_POOenJava.ejercicio04;

public class Fraccion {
  private int numerador;
  private int denominador;

  public Fraccion() {
    numerador = 0;
    denominador = 1;
  }
  
  public Fraccion(int n, int d) {
    numerador = n;
    denominador = d;
  }

  

  public void invierte(Fraccion a) {
    Fraccion c = new Fraccion();
    c = a.denominador + "/" + a.numerador;
    return c;
  }
  public void simplifica(Fraccion a) {
    
  }
  public static void multiplica(Fraccion a, Fraccion b) {
    Fraccion c = new Fraccion();
    c.numerador = a.numerador * b.numerador;
    c.denominador = a.denominador * b.denominador;
    return c;
  }
  public void divide(Fraccion a, Fraccion b) {
    
  }

}
