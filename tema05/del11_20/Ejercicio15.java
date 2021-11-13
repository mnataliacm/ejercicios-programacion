/**
 * Tema 5
 * Ejercicio 15
 * Programa que dados 2 números (base y exponente) muestre todas las potencias entre 1 y el exponente introducido.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio15 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra potencias___");
    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el exponente (entero positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());

    System.out.println("\nLas potencias son: ");
    for (int i = 1; i <= exponente; i++) {
      System.out.println(base + "^" + i);
    }
  }
}

