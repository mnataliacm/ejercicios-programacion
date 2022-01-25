package tema06.del21_32;
/**
 * Tema 6
 * Ejercicio 28
 * 
 * Programa que genera array entre 0 y 200. Los coloca de dentro afuera. El primero en la primera, el segundo en la ultima, el tercero en la segunda, el cuarto en la penultima ....
 * Pedir tamaño array.
 * Mostrar Original y Definitivo.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio28 {
  public static void main(String[] args) {

    //PEDIR DATOS
    System.out.println();
    System.out.print("Introduce el tamaño del array: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println();
    //VARIABLES
    //int num = (int)(Math.random() * 201);
    int[] n = new int[numero];
    int[] r = new int[numero];
    int conteoPar = 0;
    int conteoImpar = numero - 1;
    //PROGRAMA
    for (int i = 0; i < numero; i++) {
      n[i] = (int)(Math.random() * 201);
    }
    for (int i = 0; i < n.length; i++) {
      if (i % 2 == 0) {
        r[conteoPar] = n[i];
        conteoPar++;
      } else {
        r[conteoImpar] = n[i];
      conteoImpar--;
      }
    }
    //MUESTRO ARRAY ORIGINAL
    System.out.println("\n");
    System.out.println("Array original:");
    System.out.print("Índice ");
    for (int i = 0; i < numero; i++) { 
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < numero; i++) {
      System.out.printf("%5s", n[i]);
    }
    System.out.println();
    //MUESTRO ARRAY RESULTADO
    System.out.println("\n");
    System.out.println("Array resultado:");
    System.out.print("Índice ");
    for (int i = 0; i < numero; i++) { 
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < numero; i++) {
      System.out.printf("%5s", r[i]);
    }
    System.out.println(); 
  }
}

