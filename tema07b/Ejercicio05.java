package tema07b;
/**
 * Tema 7b
 * 
 * Ejercicio 5
 * Programa que rellena array de 6 filas y 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos)
 * Mostrar la posición del máximo y del mínimo.
 * VERSIÓN LARGA
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio05 {
  public static void main(String[] args) {

    //VARIABLES
    int[][] num = new int[6][10];
    int minimo = 1000;
    int minimoF = 0;
    int minimoC = 0;
    int maximo = 0;
    int maximoF = 0;
    int maximoC = 0;
    //PROGRAMA
    for (int columna = 0; columna < 10; columna++) {
      for (int fila = 0; fila < 6; fila++) {
        num[fila][columna] = (int)(Math.random() * 1001);
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          minimoF = fila + 1;
          minimoC = columna + 1;
        } else if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          maximoF = fila + 1;
          maximoC = columna + 1;
        }
      } 
    }  
    //MUESTRO ARRAY
    System.out.println();
    for (int i = 1; i < 11; i++) { 
      System.out.print("    C " + i);
    }
    System.out.println();
    System.out.print("  ┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐\n");
    System.out.printf("F1│");
    for (int i = 0; i < 10; i++) { 
        System.out.printf(" %4d │", num[0][i]);
    }
    System.out.println();
    System.out.print("  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤\n");
    System.out.printf("F2│");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %4s │", num[1][i]);
    }
    System.out.println();
    System.out.print("  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤\n");
    System.out.printf("F3│");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %4s │", num[2][i]);
    }
    System.out.println();
    System.out.print("  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤\n");
    System.out.printf("F4│");
    for (int i = 0; i < 10; i++) { 
        System.out.printf(" %4d │", num[3][i]);
    }
    System.out.println();
    System.out.print("  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤\n");
    System.out.printf("F5│");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %4s │", num[4][i]);
    }
    System.out.println();
    System.out.print("  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤\n");
    System.out.printf("F6│");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %4s │", num[5][i]);
    }
    System.out.println();
    System.out.println("  └───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
    System.out.println();
    System.out.println("El máximo es " + maximo + " y está en la fila: " + maximoF + " y la columna: " + maximoC);
    System.out.println("El mínimo es " + minimo + " y está en la fila: " + minimoF + " y la columna: " + minimoC);
  }
}
