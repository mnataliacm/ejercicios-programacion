package tema07b;
/**
 * Tema 7b
 * 
 * Ejercicio 5b
 * Programa que rellena array de 6 filas y 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos)
 * Mostrar la posición del máximo y del mínimo.
 * 
 * Ejercicio 6
 * Modifica el anterior para que no se repita ningún número
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {

    //VARIABLES
    int[][] num = new int[6][10];
    int minimo = 1000;
    int minimoF = 0;
    int minimoC = 0;
    int maximo = 0;
    int maximoF = 0;
    int maximoC = 0;
    boolean repite;
    int fila = 0;
    int columna = 0;
    
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          repite = false;
          for (int i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repite = true;
            }
          }
        } while (repite);
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
    for (int i = 0; i < 6; i++) {
      System.out.printf("F%s│", i);
      for (int j = 0; j < 10; j++) { 
        System.out.printf(" %4d │", num[i][j]);
      }
      if (i < 5) {
        System.out.println("\n  ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
      } else {
        System.out.println("\n  └───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
      }
    }
    System.out.println();
    System.out.println("El máximo es " + maximo + " y está en la fila: " + maximoF + " y la columna: " + maximoC);
    System.out.println("El mínimo es " + minimo + " y está en la fila: " + minimoF + " y la columna: " + minimoC);
  }
}
