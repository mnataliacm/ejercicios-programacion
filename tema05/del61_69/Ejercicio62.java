/**
 * Tema 5
 * Ejercicio 62
 * Programa que pide un un número y dice si es afortunado o no.
 * Segun cierta cultura oriental los números de la suerte son : 3, 7, 8 y 9.
 * El resto dan mala suerte: 0, 1, 2, 4, 5 y el 6.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio62 {
  public static void main(String[] args) {

    System.out.println("___Programa que indica si un número es afortunado___");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    //variables
    int num = numero;
    int suerte = 0;
    int malaSuerte = 0;
    //Comprobar números
    while (num % 10 > 0) {
      if ((num % 10 == 3) || (num % 10 == 7) || num % 10 == 8 || (num % 10 == 9)) {
        suerte++;
      } else {
        malaSuerte++;
      }
      num /= 10;
    }
    if (suerte > malaSuerte) {
      System.out.print("El " + numero + " es un número afortunado");
    } else {
      System.out.print("El " + numero + " no es un número afortunado");
    }
    System.out.println();
  }
}

