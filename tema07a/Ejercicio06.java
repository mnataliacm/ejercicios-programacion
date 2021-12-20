/**
 * Tema 7
 * Ejercicio 6
 * 
 * Programa que pide 15 números y los almacena en array. Luego mueve una posición. El último debe ir a la posición 0
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {

    //variables
    int[] numeros = new int[15];

    System.out.println("Introduce 15 números: ");
    for (int i = 0; i < 15; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    int numFin = numeros[14];
    for (int i = 14; i > 0; i--) {
      numeros[i] = numeros[i - 1];
    }
    numeros[0] = numFin;
    System.out.println("El resultado es: ");
    for (int i = 0; i < 15; i++) {
      System.out.println(numeros[i]);
    }
  }
}

