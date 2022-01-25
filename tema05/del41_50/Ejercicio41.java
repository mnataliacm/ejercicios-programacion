package tema05.del41_50;
/**
 * Tema 5
 * Ejercicio 41
 * Programa que dice cuantos digitos pares e impares hay en un número. Usar long
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio41 {
  public static void main(String[] args) {

    System.out.println("___Programa que indica pares e impares de un número dado___");
    System.out.print("Introduce un número entero positivo: ");
    long numero = Long.valueOf(System.console().readLine());

    //variables
    long num = numero;
    long cortar = 1;
    long par = 0;
    long impar = 0;
    //Contar dígitos
    while (num != 0) {
      num = num / 10;
      cortar *= 10;
    }
    //comprobar par e impar
    while (cortar > 1) {
      cortar /= 10;
      num = (numero / cortar) % 10;
      if (num % 2 == 0) {
        par++;
      } else {
        impar++;
      }
    }
    System.out.println();
    System.out.println("El número " + numero + " tiene " + par + " dígitos pares");
    System.out.println("El número " + numero + " tiene " + impar + " dígitos impares");
  }
}

