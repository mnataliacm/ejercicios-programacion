/**
 * Tema 7
 * Ejercicio 5
 * 
 * Programa que pide 10 números y luego los muestra indicando el mayor y el menor
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("___Programa que pide 10 num y muestra mayor y menor___");
    System.out.println("Pulsar ENTER trás cada número");
    //defino array abreviada
    int[] numero = new int[10];
    int mayor = 0;
    int menor = 0;
    System.out.println();
    System.out.println("Introduce 10 números: ");
    //pido números y guardo en array
    for (int i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      menor = numero[0];
      if (numero[i] > mayor) {
        mayor = numero[i];
      } else if (numero[i] < menor) {
        menor = numero[i];
      }
    }
    System.out.println();
    System.out.println("Los número son: ");
    //muestro valores
    for (int i = 0; i < 10; i++) {
      if (menor == numero[i]) {
        System.out.println(numero[i] + " menor ");
      } else if (mayor == numero[i]) {
        System.out.println(numero[i] + " mayor ");
      } else {
        System.out.println(numero[i] + " ");
      }
    }
    System.out.println();
  }
}

