package tema07a;
/**
 * Tema 7
 * Ejercicio 3
 * 
 * Programa que pide 10 números y luego los muestra en orden inverso
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("___Programa que pide 10 num y muestra en orden inverso___");
    System.out.println("Pulsar ENTER trás cada número");
    //defino array abreviada
    int[] numeros = new int[10];
    System.out.println();
    System.out.println("Introduce 10 números: ");
    //pido números y guardo en array
    for (int i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print("Los número en orden inverso son: ");
    //muestro valores
    for (int i = 9; i >= 0; i--) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
  }
}

