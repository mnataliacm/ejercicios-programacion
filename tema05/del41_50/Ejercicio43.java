package tema05.del41_50;
/**
 * Tema 5
 * Ejercicio 43
 * Programa que a partir de numero dado por teclado en dos partes, cuenta posiciones de izq a dere empezando por 1.
 * Número de dos digitos mínimo y la posición en que se parte está entre 2 y la longitud del número.
 * Pedir número y posicion para cortar.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio43 {
  public static void main(String[] args) {

    System.out.println("___Programa que parte números___");
    System.out.print("Introduce un número entero positivo (min 2 dígitos): ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce posición para partir el número: ");
    long posicion = Integer.parseInt(System.console().readLine());
    //variables 
    long num = numero;
    int conteo = 1;
    //contar dígitos
    do {
      num /= 10;
      conteo++;
    } while (num > 0);
    //cortar número
    long num1 = numero / (long)(Math.pow(10, conteo - posicion));
    long num2 = numero % (long)(Math.pow(10, conteo - posicion));
    System.out.println("Los número partidos son " + num1 + " y el " + num2);
  }
}

