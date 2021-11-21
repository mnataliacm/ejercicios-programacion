/**
 * Tema 5
 * Ejercicio 11
 * Programa que a partir de un numero dado calcula el cuadrado y el cubo de los siguientes 5 numeros enteros.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula cuadrado y cubo___");
    System.out.print("Introduce un número: ");
    int numero = (int) Double.parseDouble(System.console().readLine());
    int conteo = 0;
    do {
      numero++;
      conteo ++;
      System.out.println(" Número: " + numero + "   número²: " + numero * 2 + "   número³: " + numero*31);
    } while (conteo < 5);
  }
}

do {
  numero++;
  conteo ++;
  System.out.println(" Número: " + numero + "   número²: " + numero * 2 + "   número³: " + numero*31);
} while (conteo < 5);
