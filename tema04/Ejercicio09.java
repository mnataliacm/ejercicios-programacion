/**
 * Tema 4
 * Ejercicio 9
 * Realiza un programa que resuelva una ecuación de segundo grado
 * del tipo: ax² + bx + c = 0
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int a,b,c;
    
    System.out.println("__Programa que resuelve la ecuación: ax²+bx+c=0__");
    System.out.print("Introduce el valor de a: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de c: ");
    c = Integer.parseInt(System.console().readLine());
    
    if ((b*b-4*a*c) > 0) {
      System.out.println("La ecuación dá dos resultados: ");
      System.out.println("La primera solución es: "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
      System.out.println("La segunda solución es: "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
    } else if ((b*b-4*a*c) == 0) {
      System.out.println("La ecuación dá los mismos resultados: ");
      System.out.println("La primera solución es: "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
      System.out.println("La segunda solución es: "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
    } else {
      System.out.print("No se puede resolver la ecuación.");
    }
    
  }
}
