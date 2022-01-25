package tema07a;
/**
 * Tema 7a
 * Ejercicio 22
 * 
 * Programa que recoloca los números de un array de fuera hacia dentro.
 * Pedir tamaño del array, generar array de ese tamaño con numeros enteros aleatoriso entre 0 y 200 ambos incluidos.
 * El programa colocará desde dentro hacia fuera los números de manera que el primero va en la primera posición, el segundo va en la última, el tercero en la segunda, el cuarto en la penúltima, ect.
 * Mostrar array original y resultado.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    //VARIABLES
    //int num = (int)(Math.random() * 201);
    int numero = 0;
    int par = 0;
    int impar = 0;
    //PROGRAMA
    System.out.println("Programa que recoloca números de un array");
    System.out.print("Introduce el tamaño del array: ");
    numero = Integer.parseInt(System.console().readLine());
    int[] n = new int[numero];
    int[] r = new int[numero];
    for (int i = 0; i < numero; i++) {
      n[i] = (int)(Math.random() * 201);
    }
    impar = numero - 1;
    for (int i = 0; i < numero; i++) {
      if (i % 2 == 0) {
        r[par++] = n[i];
      } else {
        r[impar--] = n[i];
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
      System.out.printf("%5d", n[i]);
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
      System.out.printf("%5d", r[i]);
    }
    System.out.println();
  }
}

