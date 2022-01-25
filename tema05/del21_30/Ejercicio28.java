package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 28
 * Programa que calcula el factorial de un número entero leido por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio28 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula factorial de un número___");
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    int total = 1;
    for (int i = 1; i <= num; i++) {
      total = total * i;
    }
    System.out.println("\nCalculado el factorial de " + num);
    System.out.printf("%d! = %d\n", num, total);
  }
}

