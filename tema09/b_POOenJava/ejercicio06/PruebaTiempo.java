package tema09.b_POOenJava.ejercicio06;

public class PruebaTiempo {
  public static void main(String[] args) {
    
    Tiempo t1 = new Tiempo(1, 20, 30);
    Tiempo t2 = new Tiempo(0, 30, 40);
    Tiempo t3 = new Tiempo( 0, 35, 20);
    Tiempo t4 = new Tiempo(2, 50, 50);
    
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(Tiempo.suma(t2, t3));
    System.out.println(Tiempo.resta(t1, t2));
    System.out.println(Tiempo.suma(t1, t4));
    System.out.println(Tiempo.resta(t4, t1));
  }
}
