/**
 * Tema 7
 * Ejercicio 9
 * 
 * Programa que pide 8 números y luego los muestra indicando par e impar
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("___Programa que pide 10 num y muestra mayor y menor___");
    System.out.println("Pulsar ENTER trás cada número");
    //defino array abreviada
    int[] numero = new int[8];
    System.out.println();
    System.out.println("Introduce 10 números: ");
    //pido números y guardo en array
    for (int i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    System.out.println("Los número son: ");
    //muestro valores teniendo en cuenta par e impar
    for (int i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
    System.out.println();
  }
}

