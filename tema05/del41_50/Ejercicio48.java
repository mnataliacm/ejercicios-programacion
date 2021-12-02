/**
 * Tema 5
 * Ejercicio 48
 * Programa que indica que dígitos aparecen y los que no aparecen de un número introducido por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio48 {
  public static void main(String[] args) {

    System.out.println("___Que dígitos aparecen y cuales no___");
    System.out.print("Introduce un número: ");
    long numero = Long.parseLong(System.console().readLine());
    //variables 
    long num = 0;
    boolean aparece;
    //comprobar dígitos que aparecen
    System.out.print("Dígitos que aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
      aparece = false;
      num = numero;
      while (num > 0) {
        if (num % 10 == i) {
          aparece = true;
        }
        num /= 10;
      }
      if (aparece) {
        System.out.print(i + " ");
      }
    }
    //comprobar dígitos que no aparecen
    System.out.println();
    System.out.print("Dígitos que no aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
      aparece = false;
      num = numero;
      while (num > 0) {
        if (num % 10 == i) {
          aparece = true;
        }
        num /= 10;
      }
      if (!aparece) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}

