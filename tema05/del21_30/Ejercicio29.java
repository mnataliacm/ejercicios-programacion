/**
 * Tema 5
 * Ejercicio 29
 * Programa que de dos números leidos por teclado muestre los menores positivos del primero que no sean divisibles por el segundo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio29 {
  public static void main(String[] args) {

    System.out.println("___Programa___");
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el divisor: ");
    int num2 = Integer.parseInt(System.console().readLine());

    for (int i = num1 - 1; i >= 1; i--) {
      if ((i > 0) && ((i % num2) == 0)) {
        System.out.print(i + ", ");
      }
    }
    System.out.println();

  }
}

