package tema08;
/**
 * Tema 8
 * 
 * Ejercicio 15
 * Programa que muestra los primos que hay entre 1 y 1000
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio15 {
  public static void main(String[] args) {

    //programa
    System.out.println("  MUESTRA LOS PRIMOS ENTRE 1 Y 1000  ");
    System.out.println("*************************************");
    System.out.println("Los primos entre 1 y 1000 son: ");
    for (int i = 1; i < 1001; i++) {
      if (Ejercicio01_14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    } 
    System.out.println();
  }
}