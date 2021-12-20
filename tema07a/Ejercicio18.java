import java.util.Scanner;
/**
 *
 * Tema 7
 * Ejercicio 18
 * 
 * Programa que rellena un array de 10 números enteros aleatorios entre 0 y 200 (ambos incluidos)
 * Mostrar contenido junto al indice.
 * Colocar de forma alterna y en orden los menores o iguales de 100 y los mayores de 100, primero el mayor y luego el menor. Cuando se acaben completar con lo que queda.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    //VARIABLES
    Scanner s = new Scanner (System.in);
    int[] n = new int[10];
    int[] resultado = new int[15];
    int conteoMenor = 0;
    int conteoMayor = 1;
    //PROGRAMA
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      n[i] = (int)(Math.random() * 201);
      if (n[i] <= 100) {
        resultado[conteoMenor] = n[i];
        conteoMenor += 2;
      } else {
        resultado[conteoMayor] = n[i];
        conteoMayor += 2;
      }
    }
    //ARRAY ORIGINAL
    System.out.println();
    System.out.println("Array original:");
    System.out.println("\n┌───────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice    │");
    for (int i = 0; i < 10; i++) { 
      System.out.printf("%4d │", i);
    }
    System.out.println("\n├───────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor     │");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d │", n[i]);
    }
    System.out.println("\n└───────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();
    //ARRAY RESULTADO
    System.out.println();
    System.out.println("Array resultado:");
    System.out.println("\n┌───────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice    │");
    for (int i = 0; i < 10; i++) { 
      System.out.printf("%4d │", i);
    }
    System.out.println("\n├───────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor     │");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d │", resultado[i]);
    }
    System.out.println("\n└───────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println();   
  }
}
