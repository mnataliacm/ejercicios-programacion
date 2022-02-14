package tema07b;
import java.util.Scanner;
/**
 * 
 * Tema 7b
 * Ejercicio 2
 * 
 * Programa que pide 20 números enteros. Introducir en un array de 4 filas y 5 columnas. Mostrar sumas parciales de filas y columnas. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {
      
    //VARIABLES
    Scanner s = new Scanner (System.in);
    int[][] n = new int[4][5];
    int suma = 0;
    int total = 0;
    //PROGRAMA
    System.out.println("Programa que suma filas y columnas");
    System.out.println("Introduce 20 números enteros: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        n[i][j] = s.nextInt();
      }
    }
    //MUESTRO ARRAY ORIGINAL
    System.out.println("\n");
    System.out.println("Array original: \n");
    System.out.println("        Columna 1   Columna 2   Columna 3   Columna 4   Columna 5    SumaFilas");
    System.out.print("       ╭─────────────┬─────────────┬─────────────┬─────────────┬─────────────┬──────────────╮\n");
    System.out.print("Fila 1 │");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%8d   |", n[0][i]);
      suma += n[0][i];
      total += n[0][i];
    }
    System.out.printf(" Σ%8d  |", suma);
    suma = 0;
    System.out.println("\n       ├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼──────────────┤");
    System.out.print("Fila 2 │");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%8d   |", n[1][i]);
      suma += n[1][i];
      total += n[1][i];
    }
    System.out.printf(" Σ%8d  |", suma);
    suma = 0;
    System.out.println("\n       ├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼──────────────┤");
    System.out.print("Fila 3 │");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%8d   |", n[2][i]);
      suma += n[2][i];
      total += n[2][i];
    }
    System.out.printf(" Σ%8d  |", suma);
    suma = 0;
    System.out.println("\n       ├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼──────────────┤");
    System.out.print("Fila 4 │");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%8d   |", n[3][i]);
      suma += n[3][i];
      total += n[3][i];
    }
    System.out.printf(" Σ%8d  |", suma);
    suma = 0;
    System.out.println("\n       ├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┼──────────────┤");
    System.out.print("TOTALES│");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        suma += n[j][i];
      }
      System.out.printf(" Σ%8d |", suma);
      suma = 0;
    }
    System.out.printf(" Σ%8d  |", total);

    System.out.println("\n       ╰─────────────┴─────────────┴─────────────┴─────────────┴─────────────┴──────────────╯");
    System.out.println();
    s.close();
  }
}
