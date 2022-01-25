package tema05.del31_40;
/**
 * Tema 5
 * Ejercicio 36
 * Programa que diga si el numero introducido es capicúa.
 * De cualquier longitud (long)
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio36 {
  public static void main(String[] args) {

    System.out.println("___Programa que comprueba si el número es capicúa___");
    System.out.print("Introduce un número: ");
    long num = Long.parseLong(System.console().readLine());

    long numero = num;
    long ultimo = 0;
    long numeroReves = 0;

    while( numero > 0 ) {
      ultimo = numero % 10;
      numeroReves = numeroReves * 10 + ultimo;
      numero /= 10;
   }
    if (num == numeroReves) {
      System.out.println("El número " + num + " es capicúa");
    } else {
      System.out.println("El número " + num + " no es capicúa");
    }
  }
}

