/**
 * Tema 4 
 * Ejercicio 5
 * Programa que resuelva una ecuación de primer grado tipo: ax + b = 0
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("__Programa que resuelve la ecuación: ax+b=0__");
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) {
      if (b == 0) {
      System.out.println("La ecuación tiene infinitas soluciones, es compatible indeterminado");
      } else {
      System.out.println("Esta ecuación no tiene solución");
      }
    } else {
      double resultado = -b / a;
      System.out.printf("x = %.1f", resultado);
    }
  }
}
