/** * Tema 4
 * Ejercicio 6
 * Programa que calcule el tiempo que tara un objeto en caer desde altura h.
 * Formula: t= √2*h/g
 * g = 9.81m/s²
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("__Programa para calcular el tiempo que tarda un objeto en caer__");
    
    System.out.print("Introduce la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    
    if (h <= 0) {
      System.out.println("Con estos datos no hay solución");
    } else {
      double tiempo = Math.sqrt(2*h/g);
      System.out.printf("Tarda %.2f segundos",tiempo);
    }
  }
}
