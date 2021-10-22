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
    
    double resultado = -b / a;
    System.out.printf("x = %.1f", resultado);
  }
}
