/**
 * Tema 5
 * Ejercicio 25
 * Programa que pide un número y luego lo muestre del revés.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.println("___Programa que invierte los dígitos___");
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());

    int numero = num;
    int ultimo = 0;
    int numeroReves = 0;

    while( numero > 0 ) {
      ultimo = numero % 10;
      numeroReves = numeroReves * 10 + ultimo;
      numero /= 10;
   }
    System.out.println();
    System.out.println("El número " + num + " invertido es " + numeroReves );

  }
}

