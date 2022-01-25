package tema05.del11_20;
/**
 * Tema 5 Ejercicio 12 Programa que muestre los n primeros terminos de la serie
 * Fibonacci. primero = 0 segundo = 1 tercero = primero + segundo cuarto = segundo + tercero.
 * 
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("__Programa que muestra valores de la serie Fibonacci__");
    System.out.print("Cuantos valores quieres ver: ");
    int n = Integer.parseInt(System.console().readLine());

    int num1 = 0;
    int num2 = 1;
    int num3 = num1 + num2;
    System.out.println("n_Serie de FIBONACCI_");
    System.out.println("  -----------------  ");
    if (n >= 4) {
      System.out.printf("%10d \n", num1);
      System.out.printf("%10d \n", num2);
      System.out.printf("%10d \n", num3);
      for (int contador = 4; contador <= n; contador++) {
        num1 = num2;
        num2 = num3;
        num3 = num1 + num2; 
        System.out.printf("%10d \n", num3);
      } 
    } else if (n == 1) {
        System.out.printf("%10d \n", num1);
    } else if (n == 2) {
        System.out.printf("%10d \n", num1);
        System.out.printf("%10d \n", num2);
    } else if (n == 3) {
        System.out.printf("%10d \n", num1);
        System.out.printf("%10d \n", num2);
        System.out.printf("%10d \n", num3);
    } else {
      System.out.println("No ha introducido un entero positivo.");
    }
  }
}
